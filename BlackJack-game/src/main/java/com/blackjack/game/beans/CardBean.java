package com.blackjack.game.beans;
import com.blackjack.game.constants.CardNumbers;
import com.blackjack.game.constants.CardSuits;

import lombok.Data;

@Data
public class CardBean{
	
	public CardNumbers cardNumber;
	public CardSuits suit;
	
	public CardNumbers getNumber() {
		return cardNumber;
	}
	public void setNumber(CardNumbers cardNumbers) {
		cardNumber = cardNumbers;
	}
	public CardSuits getSuit() {
		return suit;
	}
	public void setSuit(CardSuits suit) {
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return "CardBean [cardNumber=" + cardNumber + ", suit=" + suit + "]";
	}
}
