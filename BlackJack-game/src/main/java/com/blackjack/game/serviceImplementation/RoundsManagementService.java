package com.blackjack.game.serviceImplementation;

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
	
	private String PLAYER_NAME = "Player1";
	
	public void roundManager(int currentRound) {
		
		if(currentRound == 1) {
			
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
				cardDealingService.dealCardsPerPlayer(shuffledDeck, playerBean.getPlayerID(), 2);
		}
	}
	
	public void finishRound() {
		
		playerManagementService.totalInHandPlayersCardValue(listOfPlayers);
		playersHandManagementService.determinatePlayerInGameStatus(listOfPlayers);
		
	}
	
	public void askPlayersForMoreCards() {
		
		for(PlayerBean playerBean : listOfPlayers) {
			
			if(playerWantsACard()) {
				cardDealingService.dealCardsPerPlayer(shuffledDeck, playerBean.getPlayerID(), 1);
				askPlayersForMoreCards();
			}
			if(!playerWantsACard()){
				playerManagementService.totalInHandPlayersCardValue(listOfPlayers);
			}
		}
	}
	
	public void giveCardToPlayer(PlayerBean player) {
		
		
	}
	
	public boolean playerWantsACard() {
		
		int playersResponse = 0;
		if(playersResponse == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
