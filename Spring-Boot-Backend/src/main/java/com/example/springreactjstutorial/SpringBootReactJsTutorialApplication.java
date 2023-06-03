package com.example.springreactjstutorial;

import com.example.springreactjstutorial.model.User;
import com.example.springreactjstutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootReactJsTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactJsTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.saveAll(List.of(
				new User("Louis","Wambua","wambualouis@gmail.com"),
				new User("Mutua","Kiilu","mutuakiilu@gmail.com"),
				new User("Irene","Moses","irenemoses@gmail.com")
		));
	}
}
