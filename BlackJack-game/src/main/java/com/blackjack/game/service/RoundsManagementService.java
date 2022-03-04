package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;
import com.blackjack.game.userInput.RequestPlayerInput;

public class RoundsManagementService {
	
	private List<CardBean> orderedDeck = new ArrayList<CardBean>();
	private List<CardBean> shuffledDeck = new ArrayList<CardBean>();
	
	private DeckService deckService = new DeckService();
	private PlayerManagementService playerManagementService = new PlayerManagementService();
	private CardDealingService cardDealingService = new CardDealingService();
	private PlayersHandManagementService playersHandManagementService = new PlayersHandManagementService();
	private RequestPlayerInput requestPlayerInput = new RequestPlayerInput();
	
	private List<PlayerBean> listOfPlayers = playerManagementService.currentListOfPlayersInGame();
	private int roundNumber;
		
	public void roundManagement(int roundNumber) {
		
		this.roundNumber = roundNumber;
		if(this.roundNumber==1) {
			initializeDeckForGame();
			playerManagementService.createHousePlayer();
			playerManagementService.createPlayer(requestPlayerInput.inputPlayerName());
			
			for(PlayerBean player : listOfPlayers) {
				cardDealingService.dealCardsPerPlayer(shuffledDeck, player, 2);
			}
			
		finishRound();
			
		}
		
		else {
			
			startRound();
		}
		
		finishRound();
		
	}
	
	public void startRound() {
		
		int playerWantsMoreCards = 0;
		
		for(PlayerBean player : listOfPlayers) {
			
			System.out.println(player.getCurrentPlayerCards());
			playerWantsMoreCards = requestPlayerInput.inputAskingForOneCard();
			while(playerWantsMoreCards == 1) {
				cardDealingService.dealCardsPerPlayer(shuffledDeck, player, 1);
			}

		}
		
	}
	
	public void finishRound() {
		
		for(PlayerBean player : listOfPlayers) {
			playersHandManagementService.setPlayerInGameStatus(player);
		}
		
		if((listOfPlayers.size()-1) > 1) {
			playersHandManagementService.removeLooserFromGame(listOfPlayers);
			playersHandManagementService.checkForWinnerPlayer(listOfPlayers);
		}
		
	}
	
	public void initializeDeckForGame() {
		orderedDeck = deckService.createDeck();
		shuffledDeck = deckService.shuffleDeck(orderedDeck);
	}
	
}
