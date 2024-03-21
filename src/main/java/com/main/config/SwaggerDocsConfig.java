package com.main.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig 
{
    
	@Bean
	public Docket createDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)//UI Screen type
				.select()//to specify rest controller
				.apis(RequestHandlerSelectors.basePackage("com.main.controller"))//base package for rest controller
				.paths(PathSelectors.regex("/api.*"))//to specify request path
				.build()//build the Docket object
				.useDefaultResponseMessages(true)
				.apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() 
	{
		 Contact contact = new Contact("raja","http://www.HCL.com/api","ssukanta531@gmail.com");
		 
		return new ApiInfo("DoctorApi",
				"Gives Doctor Related Activity",
				"3.4.RELEASE","http://www.HCL.com/licencse",contact,"GNU Public",
				"http://apace.org/license/gnu",Collections.emptyList());
	}
}
