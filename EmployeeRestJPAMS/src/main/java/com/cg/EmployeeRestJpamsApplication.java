package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeRestJpamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestJpamsApplication.class, args);
	}
	
	@Configuration
    class RestTemplateConfig {
            
            @Bean
            //@LoadBalanced
            public RestTemplate restTemplate() {
              return new RestTemplate();
            }
    }

}
