package com.muniao.demo.service;

import com.muniao.demo.model.primary.Player;
import com.muniao.demo.model.secondary.Player2;

public interface PlayerService {
	public Player savePlayer1(Player player);
	
	public Player2 savePlayer2(Player2 player);
	
	public void savePlayer(Player player1, Player2 player2);
}
