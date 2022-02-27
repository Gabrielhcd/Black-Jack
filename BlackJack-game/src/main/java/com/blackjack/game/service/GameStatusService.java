package com.blackjack.game.service;

public class GameStatusService {
	
	private RoundsManagementService roundsManagementService = new RoundsManagementService();
	
	private int FIRST_ROUND = 1;
	
	public void startGame() {
		
		System.out.println("Game started");
		roundsManagementService.roundManagement(FIRST_ROUND);
	}
	
	public void finishGame() {
		System.out.println("Game finished");
	}

}
