package com.blackjack.game.userInput;

import java.util.Scanner;

import com.blackjack.game.service.PlayerManagementService;

public class RequestPlayerInput {
	
	Scanner scanner = new Scanner(System.in);
	
	PlayerManagementService playerManagementService = new PlayerManagementService();
	
	public String inputPlayerName() {
		
		System.out.println("Enter player name");
		String playerName = scanner.nextLine();
		return playerName;
	}
	
	public int inputAskingForOneCard() {
		
		System.out.println("Do you want one more card");
		int playerWantsCard = scanner.nextInt();
		return playerWantsCard;
	}

}
