package com.blackjack.game;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blackjack.game.service.*;

@SpringBootApplication
public class BlackJackGameApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlackJackGameApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DeckService deckService = new DeckService();
		
		deckService.createDeck();
		
	}

}
