package com.blackjack.game.services;

import java.util.List;

import com.blackjack.game.beans.PlayerBean;

public interface PlayerManagementService {
	
	public static void createHousePlayer() {}
	
	public static void createPlayer(String playerName) {}
	
	public static void addToListOfPlayers(PlayerBean newPlayer) {}
	
	public static void currentListOfPlayersInGame(){}
	
	public static void totalInHandPlayersCardValue(PlayerBean playerBean) {}
}
