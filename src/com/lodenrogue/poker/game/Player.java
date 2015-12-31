package com.lodenrogue.poker.game;

import java.util.List;

public class Player {
//	private Hand hand;
	private List<Card> hand;
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public List<Card> getHand() {
		return hand;
	}
}
