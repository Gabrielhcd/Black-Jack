package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;

public class CardDealingService {
	
	private List<CardBean> cardsToDealToPlayer = new ArrayList<CardBean>();
	
	public void dealCardsPerPlayer(List<CardBean> cardsDeck, PlayerBean playerToDeal, int amountOfCardsToDeal) {

		System.out.println("Entering dealCardsPerPlayer");
		
		while(amountOfCardsToDeal > 0) {
			
			cardsToDealToPlayer.add(cardsDeck.get(cardsDeck.size()-1));//add the last card to a temporary list
			playerToDeal.setCurrentHandValue(playerToDeal.getCurrentHandValue() + 
					cardsDeck.get(cardsDeck.size()-1).getNumber().getCardNumber());//add the latatest card to the current hand
			cardsDeck.remove(cardsDeck.size()-1);//remove the last card from deck
			amountOfCardsToDeal--;
			
		}
		
		playerToDeal.setCurrentPlayerCards(cardsToDealToPlayer);
		//System.out.println("Cards dealed to playerID " + playerToDeal.getPlayerName() + " Cards " + playerToDeal.getCurrentPlayerCards());
		cardsToDealToPlayer.clear();
		
	}
	
}
