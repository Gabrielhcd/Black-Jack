package com.blackjack.game.constants;

public enum DeckUnits {
	
	CARDSPERDECK(52);
	
	private int cardsPerDeck;
	
	DeckUnits(int cardsPerDeck){
		
		this.cardsPerDeck = cardsPerDeck;
	}
	
	public int getCardsPerDeck() {
		return cardsPerDeck;
	}

	public void setCardsPerDeck(int cardsPerDeck) {
		this.cardsPerDeck = cardsPerDeck;
	}
	

}
