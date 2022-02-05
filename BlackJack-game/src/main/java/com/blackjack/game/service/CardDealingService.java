package com.blackjack.game.service;

import java.util.ArrayList;
import java.util.List;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.beans.PlayerBean;

public class CardDealingService {
	
	private List<CardBean> cardsForPlayer = new ArrayList<CardBean>();
	
	public void dealCardsPerPlayer(List<CardBean> cardsDeck, int playerID, int amountOfCardsToDeal) {
		
		int cardsDealed = 0;
		System.out.println("Deck size: " + cardsDeck.size() + " CardDealer");
		System.out.println("Entering dealCardsPerPlayer");
		
		PlayerBean playerBean = new PlayerBean();
		
		while(amountOfCardsToDeal > 0) {
			
			cardsForPlayer.add(cardsDeck.get((cardsDeck.size() - 1) - cardsDealed));
			System.out.println("Deck size: " + cardsDeck.size());
			cardsDeck.remove((cardsDeck.size() - 1) - cardsDealed);
			cardsDealed++;
			amountOfCardsToDeal--;
		}
		
		playerBean.setCurrentPlayerCards(cardsForPlayer);
		System.out.println("Cards dealed to playerID " + playerID);
		
	}
	
}
