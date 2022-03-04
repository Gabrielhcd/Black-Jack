package com.blackjack.game.service;

import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;
import com.blackjack.game.constants.CardNumbers;

public class PlayersHandManagementService {

	public void setPlayerInGameStatus(PlayerBean player) {
		
		if(player.getCurrentHandValue() == 21) {
			player.setPlayerInGameStatus(2);
		}
		else if(player.getCurrentHandValue() < 21) {
			player.setPlayerInGameStatus(1);
		}
		else if(player.getCurrentHandValue() > 21) {
			player.setPlayerInGameStatus(0);
		}
	}
	
	public void removeLooserFromGame(List<PlayerBean> listOfPlayers) {
		
		for(PlayerBean player : listOfPlayers) {
			if(player.getPlayerInGameStatus() == 0) {
				listOfPlayers.remove(player);
			}
		}
	}
	
	public void checkForWinnerPlayer(List<PlayerBean> listOfPlayers) {
		
		for(PlayerBean player : listOfPlayers) {
			if(player.getPlayerInGameStatus() == 2) {
				System.out.println("Player " + player.getPlayerName() + " Wins!!!!");
			}
		}
	}

}
