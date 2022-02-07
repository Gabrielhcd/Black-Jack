package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;

public class RoundsManagementService {
	
	private List<CardBean> orderedDeck = new ArrayList<CardBean>();
	private List<CardBean> shuffledDeck = new ArrayList<CardBean>();
	
	private DeckService deckService = new DeckService();
	private PlayerManagementService playerManagementService = new PlayerManagementService();
	private CardDealingService cardDealingService = new CardDealingService();
	private PlayersHandManagementService playersHandManagementService = new PlayersHandManagementService();
	
	private List<PlayerBean> listOfPlayers = playerManagementService.currentListOfPlayersInGame();
	private int cardsToDeal = 0;
	
	private String PLAYER_NAME = "Player1";
	
	public void manageRoundBegining(int currentRound) {
		
		if(currentRound == 1) {
			
			cardsToDeal = 2;
			playerManagementService.createHousePlayer();
			playerManagementService.createPlayer(PLAYER_NAME);
			orderedDeck = deckService.createDeck();
			shuffledDeck = deckService.shuffleDeck(orderedDeck);
			
			startRound();
		}
		else {
			startRound();
		}
		
		finishRound();
	
	}
	
	public void startRound() {
		
		for(PlayerBean playerBean : listOfPlayers) {
				cardDealingService.dealCardsPerPlayer(shuffledDeck, playerBean.getPlayerID(), cardsToDeal);
		}
	}
	
	public void finishRound() {
		
		for(PlayerBean playerBean : listOfPlayers) {
			playersHandManagementService.determinatePlayersHandValue(playerBean.getCurrentHandValue());
		}
	}
	
	public boolean askPlayerForMoreCards() {
		
		int playersResponse = 0;
		if(playersResponse == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
