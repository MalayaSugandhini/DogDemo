package com.example.DogDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class DogDemoApplication {

	public static void main(String[] args) {
		ApplicationContext Animals = SpringApplication.run(DogDemoApplication.class, args);
		System.out.println("Hello SpringBoot");
		System.out.println("Bye to your Old Self");
		
		Trainer target = Animals.getBean(Trainer.class);
		target.setId(6785);
		target.setName("Sravan");
		
		Dog Family = Animals.getBean(Dog.class);
		Family.setId(12345);
		Family.setName("KOBA");
		Family.setBreed("Sherped");
		
		Dog FamilyAnother = Animals.getBean(Dog.class);
		FamilyAnother.setId(123456);
		FamilyAnother.setName("KOBA1");
		FamilyAnother.setBreed("Sherped1");
		FamilyAnother.setTrainer(target);
		System.out.println(FamilyAnother.getTrainer()); 
		
		System.out.println(Family);

		System.out.println(FamilyAnother);
		
	
	}

}
