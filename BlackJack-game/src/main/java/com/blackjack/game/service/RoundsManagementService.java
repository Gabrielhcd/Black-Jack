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
	
	private String PLAYER_NAME = "Player1";
	
	public void startRound(int currentRound) {
		
		
		
		List<PlayerBean> currentListOfPlayers = playerManagementService.currentListOfPlayersInGame();
		
		if(currentRound == 1) {
			
			playerManagementService.createHousePlayer();
			playerManagementService.createPlayer(PLAYER_NAME);
			orderedDeck = deckService.createDeck();
			shuffledDeck = deckService.shuffleDeck(orderedDeck);
			
			if(currentListOfPlayers.isEmpty()) {
				
				System.out.println("Players list is empty man :( ");
				
			}
			else {
				
				for(PlayerBean playerBean : currentListOfPlayers) {
					System.out.println("Entra al ciclo para repartir");
					System.out.println("Deck size: " + shuffledDeck.size() + " RoundsManager");
					cardDealingService.dealCardsPerPlayer(shuffledDeck, playerBean.getPlayerID(), 2);
				}
				
				System.out.println("Cards dealed for first round");
				
			}
			
		}
		
	}
	
	public void checkPlayersHand(PlayerBean playerBean) {
		
		for(CardBean cardBean : playerBean.getCurrentPlayerCards()) {
			
			
			
		}
		
	}

}
