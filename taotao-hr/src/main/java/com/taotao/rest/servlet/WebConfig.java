package com.taotao.rest.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Administrator on 2017/5/31.
 */

@Configuration
//启用SpringMvc
@EnableWebMvc
@ComponentScan("com.taotao.rest.controller")
public class WebConfig extends WebMvcConfigurerAdapter{


    @Bean
    public ViewResolver viewResolver(){
                InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("");
        resolver.setSuffix("");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }



    //静态资源
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        super.configureDefaultServletHandling(configurer);
        configurer.enable();
        
    }
}
