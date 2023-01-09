package com.oes.app;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.oes.controller.usercontroller;
import com.oes.entity.user;
import com.oes.repository.userrepository;

@SpringBootApplication
@EntityScan(basePackages = {"com.oes"})
@EnableJpaRepositories(basePackages = {"com.oes.repository"})
@ComponentScan(basePackages = {"com.oes"})
public class OesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OesApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(OesApplication.class, args);
//		userrepository userRepository = context.getBean(userrepository.class);
//		user user1 = new user();
//		
//		user1.setFirstName("Tom");
//		user1.setLastName("Cruise");
//		user1.setRole("Proctor");
//		user1.setEmailId("tom.cruise@oes.com");
//		
//		user user2 =  userRepository.save(user1);
//		
//		//System.out.println(user2);
//		
//		usercontroller userc1 = new usercontroller();
//		
//		Iterable<user> allUser = userc1.getAllUsers();
//		allUser.forEach(e -> {
//			System.out.println(e);
//		});
		
	}
	
	

}
