package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;

public class CardDealingService {
	
	private List<CardBean> inGameDeck = new ArrayList<CardBean>();
	private List<CardBean> cardsToDealToPlayer = new ArrayList<CardBean>();
	private List<PlayerBean> listOfPlayers = new ArrayList<PlayerBean>();
	
	public void dealCardsPerPlayer(List<CardBean> cardsDeck, int playerID, int amountOfCardsToDeal) {
		
		int cardsDealed = 0;
		System.out.println("Deck size: " + cardsDeck.size() + " CardDealer");
		System.out.println("Entering dealCardsPerPlayer");
		
		PlayerBean playerToDeal = new PlayerBean();
		
		while(amountOfCardsToDeal > 0) {
			
			for(PlayerBean playerBean : listOfPlayers) {
				//Cambiar por equals()
				if(playerBean.getPlayerID() == playerID) {
					
					playerToDeal = playerBean;
					cardsToDealToPlayer.add(cardsDeck.get((cardsDeck.size() - 1) - cardsDealed));
					System.out.println("Deck size: " + cardsDeck.size());
					cardsDeck.remove((cardsDeck.size() - 1) - cardsDealed);
					cardsDealed++;
					amountOfCardsToDeal--;
					
				}
				else {
					System.out.println("PlayerID not found!!");
				}
				
			}
			
		}
		
		playerToDeal.setCurrentPlayerCards(cardsToDealToPlayer);
		System.out.println("Cards dealed to playerID " + playerID);
		
	}
	
}
