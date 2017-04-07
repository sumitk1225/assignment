package com.thinair.assingnment.job;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@EnableJpaRepositories
@EntityScan("com.thinair.assingnment.domain")
public class RestApiControllerService {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
 
    
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestApiControllerService.class, args);
    }
}
