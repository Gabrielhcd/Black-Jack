package com.blackjack.game.constants;

public enum CardSuits {
	
	HEARTS("hearts", "red"),
	SPADES("spades", "black"),
	DIAMONDS("diamonds", "red"),
	CLUBS("clubs", "black");
	
	private String cardSuit;
	private String cardColor;
	
	CardSuits(String cardSuit, String cardColor){
		
		this.cardSuit = cardSuit;
		this.cardColor = cardColor;
	}

	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public String getCardColor() {
		return cardColor;
	}

	public void setCardColor(String cardColor) {
		this.cardColor = cardColor;
	}
	
	
	

}
