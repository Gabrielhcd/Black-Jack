package com.blackjack.game.serviceImplementation;

import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;
import com.blackjack.game.constants.CardNumbers;

public class PlayersHandManagementService {
	
	public static int checkTotalInPlayersHand(List<CardBean> playersDeckInHand) {	
		
		int totalInHand = 0;
		
		for(CardBean cardBean : playersDeckInHand) {
			for(CardNumbers cardNumbers : CardNumbers.values()) {
				totalInHand += cardNumbers.getCardNumber();
			}
			
		}
		
		return totalInHand;
		
	}

	public int assignPlayerInGameStatus(PlayerBean player) {
		
		int playerInGameStatus = 0;
		
		if(player.getCurrentHandValue() > 21) {
			playerInGameStatus = 1;//Looser
		}
		else if(player.getCurrentHandValue() == 21) {
			playerInGameStatus = 2;//Winner
		}
		else if(player.getCurrentHandValue() < 21) {
			playerInGameStatus = 0;//Player
		}
		
		return playerInGameStatus;
	}
	
	public void determinatePlayerInGameStatus(List<PlayerBean> listOfPlayers) {
		
		for(PlayerBean playerBean : listOfPlayers) {
			
			if(playerBean.getPlayerInGameStatus() == 1) {
				listOfPlayers.remove(playerBean.getPlayerID());
				System.out.println("Player with ID " + playerBean.getPlayerID() + "removed");
			}
			if(playerBean.getPlayerInGameStatus() == 2) {
				System.out.println("Player with ID " + playerBean.getPlayerID() + "won!!!");
			}
			if(playerBean.getPlayerInGameStatus() == 0) {
				System.out.println("Player with ID " + playerBean.getPlayerID() + "continues");
			}
			else {
				System.out.println("An unexpected error ocurred");
			}
			
		}
	}

}
