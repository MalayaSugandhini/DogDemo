package com.example.DogDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value = "prototype")
public class Dog {
	private int id;
	private String name;
	private String breed;
	
	public Dog() {
		id =14325;
		name = "Kai";
		breed = "lab";
		System.out.println("Hello KOBAKAI, Welcome to the world");
	}
	
	@Autowired
	private Trainer trainer;
	
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + "]"+ "\n"+ trainer.toString();
	}
	

}
