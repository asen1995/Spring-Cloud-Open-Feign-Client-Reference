package com.example.springcloudopenfeignclientreference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOpenFeignClientReferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenFeignClientReferenceApplication.class, args);
	}

}
