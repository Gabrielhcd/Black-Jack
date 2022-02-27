package com.blackjack.game.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PlayerBean {
	
	public char playerID;
	public String playerName;
	public int playerMoney;
	public int playerMoneyInRound;
	public int currentNumberOfCards;
	public int currentHandValue;
	public int currentRoundIn;
	public int playerInGameStatus; //0 looses, 1 continues, 2 winner
	public CardBean cardFromDeck;
	public List<CardBean> currentPlayerCards = new ArrayList<CardBean>();
	
	public PlayerBean() {
		// TODO Auto-generated constructor stub
	}

	public PlayerBean(char playerID, String playerName, int playerMoney, int playerMoneyInRound,
			int currentNumberOfCards, int currentHandValue, int currentRoundIn, int playerInGameStatus, CardBean cardFromDeck,
			List<CardBean> currentPlayerCards) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.playerMoney = playerMoney;
		this.playerMoneyInRound = playerMoneyInRound;
		this.currentNumberOfCards = currentNumberOfCards;
		this.currentHandValue = currentHandValue;
		this.currentRoundIn = currentRoundIn;
		this.playerInGameStatus = playerInGameStatus;
		this.cardFromDeck = cardFromDeck;
		this.currentPlayerCards = currentPlayerCards;
	}

	public char getPlayerID() {
		return playerID;
	}

	public void setPlayerID(char playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerMoney() {
		return playerMoney;
	}

	public void setPlayerMoney(int playerMoney) {
		this.playerMoney = playerMoney;
	}

	public int getPlayerMoneyInRound() {
		return playerMoneyInRound;
	}

	public void setPlayerMoneyInRound(int playerMoneyInRound) {
		this.playerMoneyInRound = playerMoneyInRound;
	}

	public int getCurrentNumberOfCards() {
		return currentNumberOfCards;
	}

	public void setCurrentNumberOfCards(int currentNumberOfCards) {
		this.currentNumberOfCards = currentNumberOfCards;
	}

	public int getCurrentHandValue() {
		return currentHandValue;
	}

	public void setCurrentHandValue(int currentHandValue) {
		this.currentHandValue = currentHandValue;
	}

	public int getCurrentRoundIn() {
		return currentRoundIn;
	}

	public void setCurrentRoundIn(int currentRoundIn) {
		this.currentRoundIn = currentRoundIn;
	}
	
	public int getPlayerInGameStatus() {
		return playerInGameStatus;
	}
	
	public void setPlayerInGameStatus(int playerInGameStatus) {
		this.playerInGameStatus = playerInGameStatus;
	}
	
	public CardBean getCardFromDeck() {
		return cardFromDeck;
	}

	public void setCardFromDeck(CardBean cardFromDeck) {
		this.cardFromDeck = cardFromDeck;
	}

	public List<CardBean> getCurrentPlayerCards() {
		return currentPlayerCards;
	}

	public void setCurrentPlayerCards(List<CardBean> currentPlayerCards) {
		this.currentPlayerCards = currentPlayerCards;
	}

	@Override
	public String toString() {
		return "PlayerBean [playerID=" + playerID + ", playerName=" + playerName + ", playerMoney=" + playerMoney
				+ ", playerMoneyInRound=" + playerMoneyInRound + ", currentNumberOfCards=" + currentNumberOfCards
				+ ", currentHandValue=" + currentHandValue + ", currentRoundIn=" + currentRoundIn + ", cardFromDeck="
				+ cardFromDeck + ", currentPlayerCards=" + currentPlayerCards + "]";
	}
	
	
	

}
