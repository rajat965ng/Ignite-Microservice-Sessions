package com.customer.ctx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@Controller
@EnableAutoConfiguration
@ComponentScan*/

@SpringBootApplication(scanBasePackages="com.customer.*")
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
