package com.blackjack.game.services;

import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;

public interface PlayersHandManagementService {
	
	public static void checkTotalInPlayersHand(List<CardBean> playersDeckInHand) {}
	
	public static void assignPlayerInGameStatus(PlayerBean player) {}
		
	public static void determinatePlayerInGameStatus(List<PlayerBean> listOfPlayers) {}

}
