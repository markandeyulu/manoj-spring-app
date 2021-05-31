package com.amazon.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.amazon.app.dao.ProductDAO;

@Configuration
@EnableWebMvc //this will tell instead xml we r gonna use java based configuration. This will be ony used to specify for webMVC not in spring core applications
@ComponentScan(basePackages = { "com.amazon.app.*" })
public class WebConfigFile {


	@Bean("p1")
	//@Profile("testing")
	public ProductDAO getProductDAO1() {
		return new ProductDAO("Testing");
	}
	@Bean
	public InternalResourceViewResolver getResolved() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
}
