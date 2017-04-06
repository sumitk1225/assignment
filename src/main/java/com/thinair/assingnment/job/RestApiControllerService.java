package com.thinair.assingnment.job;

import org.h2.server.web.WebServlet;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@EnableJpaRepositories
public class RestApiControllerService {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestApiControllerService.class, args);
    }
}
