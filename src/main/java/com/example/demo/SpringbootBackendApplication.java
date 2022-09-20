package com.example.demo;

import com.example.demo.Services.ItTicketService;
import com.example.demo.controller.ItTicketController;
import com.example.demo.model.ItTicket;
import com.example.demo.model.User;
import com.example.demo.repository.TicketRepository;
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

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public void run(String... args) throws Exception{
		User  user1 = new User("Alex", "Anguiano", "alexanguiano96@gmail.com", "480-335-2816", "IT Department", 1);
		User user2 = new User("Percy", "Jackson", "percyjackson@gmail.com", "123-456-7890", "Legislative", 12);
		User user3 = new User("Grover", "Underwood", "groverunderwood@gmail.com", "123-456-7891", "Senate", 4);
		User user4 = new User("Nico", "Di Angelo", "nicodiangelo@gmail.com", "123-456-7892", "IT Department", 6);
		User user5 = new User("Annabeth", "Chase", "annabethchase@gmail.com", "123-456-7893", "Senate", 3);
		User user6 = new User("Bianca", "Di Angelo", "biancaDiAngelo@gmail.com", "123-456-7893", "Legislative", 2);
		User user7 = new User("Clarrissa", "Areis", "clarrissaAriesa@gmail.com", "123-456-7893", "Senate", 3);
		User user8 = new User("Zeus", "Olympian", "zeus@gmail.com", "123-456-7893", "Legislative", 5);
		User user9 = new User("Poseidon", "Olympian", "poseidon@gmail.com", "123-456-7893", "Senate", 3);
		User user0 = new User("Artemis", "Of the Hunt", "Artemis@gmail.com", "123-456-7893", "Senate", 3);

		this.userRepository.save(user0);
		this.userRepository.save(user1);
		this.userRepository.save(user2);
		this.userRepository.save(user3);
		this.userRepository.save(user4);
		this.userRepository.save(user5);
		this.userRepository.save(user6);
		this.userRepository.save(user7);
		this.userRepository.save(user8);
		this.userRepository.save(user9);

		this.ticketRepository.save(new ItTicket("Provided Hardware Stopped working", "Computer Stopped working", "IT Device", user0.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 1", "Computer Stopped working", "IT Device", user1.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 2", "Computer Stopped working", "Software Issue", user2.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 3", "Computer Stopped working", "Hardware Issue/Replacement", user3.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 4", "Computer Stopped working", "Network / VPN issue", user4.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 5", "Computer Stopped working", "Account Credentials", user5.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 6", "Computer Stopped working", "IT Device", user6.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 7", "Computer Stopped working", "IT Device", user7.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 8", "Computer Stopped working", "IT Device", user8.getId()));
		this.ticketRepository.save(new ItTicket("Example Title 9", "Computer Stopped working", "IT Device", user9.getId()));

	}



}
