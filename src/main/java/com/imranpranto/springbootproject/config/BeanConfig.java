package com.imranpranto.springbootproject.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imranpranto.springbootproject.model.Coder;
import com.imranpranto.springbootproject.model.Computer;
@Configuration
public class BeanConfig {
    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){
        Coder c1 = new Coder(1001, "Mr Adam","Java", computer);
        // c1.setId(1001);
        // c1.setName("Mr Adam");
        // c1.setLanguage("Java");
        // c1.setComputer(computer);

        //constructor

        return c1;
    }
    @Bean
    public Coder coder2(@Qualifier("computer2")Computer computer){
        Coder c2 = new Coder();
        c2.setId(1001);
        c2.setName("Mr Adam");
        c2.setLanguage("Java");
        c2.setComputer(computer);

        return c2;
    }

    
    @Bean
    public Computer computer1(){
        Computer comp1 = new Computer("AMD");
        // comp1.setBrand("AMD");

        return comp1;
    }
    @Bean
    public Computer computer2(){
        Computer comp2 = new Computer();
        comp2.setBrand("Intel");

        return comp2;
    }

}
