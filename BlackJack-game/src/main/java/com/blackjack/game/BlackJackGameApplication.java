package com.blackjack.game;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blackjack.game.service.GameStatusService;

@SpringBootApplication
public class BlackJackGameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlackJackGameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		GameStatusService gameStatusService = new GameStatusService();
		
		gameStatusService.startGame();
		
	}

}
