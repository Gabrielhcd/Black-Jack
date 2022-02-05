package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.PlayerBean;

public class PlayerManagementService {
	
	private List<PlayerBean> listOfPlayers = new ArrayList<PlayerBean>();

	public void createHousePlayer() {
		
		PlayerBean theHousePlayer = new PlayerBean();
		theHousePlayer.setPlayerID('0');
		theHousePlayer.setPlayerName("The House");
		theHousePlayer.setPlayerInGameStatus(0);
		
		System.out.println("House player created!!");
		
		listOfPlayers.add(theHousePlayer);
		
	}

	public void createPlayer(String playerName) {
		
		PlayerBean newPlayer = new PlayerBean();
		newPlayer.setPlayerID('1');
		newPlayer.setPlayerName(playerName);
		newPlayer.setPlayerInGameStatus(0);
		
		System.out.println("Player " + newPlayer.getPlayerName() + " created succesfully!!.");
		
		addToListOfPlayers(newPlayer);
		
	}
	
	public void addToListOfPlayers(PlayerBean newPlayer) {
		
		if(listOfPlayers.add(newPlayer)) {
			System.out.println("New " + newPlayer.getPlayerName() + " player added to game!");
		}
		else {
			System.out.println("Error adding new player to game!");
		}
		
	}
	
	public List<PlayerBean> currentListOfPlayersInGame(){
		
		List<PlayerBean> listOfPlayersInGame = listOfPlayers;
		
		System.out.println("List of Players in game: ");
		for(PlayerBean playerBean : listOfPlayersInGame) {
			System.out.println(playerBean.getPlayerName());
		}
		
		return listOfPlayersInGame;
		
	}
	
}
