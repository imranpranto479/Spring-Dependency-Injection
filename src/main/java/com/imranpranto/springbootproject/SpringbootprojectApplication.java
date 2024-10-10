package com.imranpranto.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.imranpranto.springbootproject.config.BeanConfig;
import com.imranpranto.springbootproject.model.Coder;

@SpringBootApplication
// @ImportResource({"classpath:BeanConfig.xml"})
@Import({BeanConfig.class})
public class SpringbootprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootprojectApplication.class, args);
		
		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println(c1.getName());
		System.out.println(c1.getLanguage());
		System.out.println(c1.getComputer().getBrand());


		Coder c2 = (Coder) context.getBean("coder2");
		System.out.println(c2.getName());
		System.out.println(c2.getLanguage());
		System.out.println(c2.getComputer().getBrand());
	}

}
