package com.lodenrogue.poker.game;

import java.util.HashSet;
import java.util.Set;

public class Table {
	private Set<Player> players;

	public Table() {
		players = new HashSet<>();
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public boolean addPlayer(Player player) {
		return players.add(player);
	}
}
