package com.example.demo;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("Alex", "Anguiano", "alexanguiano96@gmail.com", "480-335-2816", "IT Department", 1));
		this.userRepository.save(new User("Percy", "Jackson", "percyjackson@gmail.com", "123-456-7890", "Legislative", 12));
		this.userRepository.save(new User("Grover", "Underwood", "groverunderwood@gmail.com", "123-456-7891", "Senate", 4));
		this.userRepository.save(new User("Nico", "Di Angelo", "nicodiangelo@gmail.com", "123-456-7892", "IT Department", 6));
		this.userRepository.save(new User("Annabeth", "Chase", "annabethchase@gmail.com", "123-456-7893", "Senate", 3));
	}



}
