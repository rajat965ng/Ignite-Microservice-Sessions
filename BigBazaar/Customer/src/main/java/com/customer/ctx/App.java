package com.customer.ctx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*@Controller
@EnableAutoConfiguration
@ComponentScan*/

@SpringBootApplication(scanBasePackages="com.customer.*")
@EnableEurekaClient
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
