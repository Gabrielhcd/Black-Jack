package com.blackjack.game;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blackjack.game.serviceImplementation.*;

@SpringBootApplication
public class BlackJackGameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlackJackGameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LaunchGameComponent launchGameComponent = new LaunchGameComponent();
		
		launchGameComponent.launchGame();
		
	}

}
