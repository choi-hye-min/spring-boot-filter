package com.example.demo.config;

import com.example.demo.filter.HelloFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
         FilterRegistrationBean registrationBean = new FilterRegistrationBean();

         registrationBean.setFilter(helloFilter());
         registrationBean.addUrlPatterns("/test/*");

         return registrationBean;
    }

    @Bean(name = "helloFilter")
    public Filter helloFilter(){
        return new HelloFilter();
    }
}
