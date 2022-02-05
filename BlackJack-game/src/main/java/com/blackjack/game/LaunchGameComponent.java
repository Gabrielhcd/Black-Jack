package com.blackjack.game;

import com.blackjack.game.service.RoundsManagementService;

public class LaunchGameComponent {
	
	private RoundsManagementService roundsManagementService = new RoundsManagementService();
	
	private int FIRST_ROUND = 1;
	
	public void launchGame() {
			
		roundsManagementService.startRound(FIRST_ROUND);
		
	}

}
