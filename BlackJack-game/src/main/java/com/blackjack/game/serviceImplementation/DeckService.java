package com.blackjack.game.serviceImplementation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

import com.blackjack.game.beans.CardBean;
import com.blackjack.game.constants.CardNumbers;
import com.blackjack.game.constants.CardSuits;

public class DeckService {
	
	private List<CardBean> cardsDeck = new ArrayList<CardBean>();
	
	public List<CardBean> createDeck() {
		
		System.out.println("Deck sin barajear");
		
		for(CardSuits cardSuits : CardSuits.values()) {
			for(CardNumbers cardNumber : CardNumbers.values()) {
					
					CardBean cardBean = new CardBean();
					
					cardBean.setNumber(cardNumber);
					cardBean.setSuit(cardSuits);
					
					cardsDeck.add(cardBean);
					
					//System.out.println(cardBean);
					
			}	
		}
		
		return cardsDeck;
		
	}
	
	public List<CardBean> shuffleDeck(List<CardBean> cardsDeck) {
		
		Collections.shuffle(cardsDeck, new Random());
		
		/*for(CardBean cardBean : cardsDeck) {
			System.out.println(cardBean);
		}*/
		
		System.out.println("Deck barajeado");
		System.out.println("Deck size: " + cardsDeck.size() + " DeckService");
		
		return cardsDeck;
		
	}
}
