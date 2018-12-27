package com.muniao.demo.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muniao.demo.model.primary.Player;
import com.muniao.demo.model.secondary.Player2;
import com.muniao.demo.service.PlayerService;

@Service("commonPlayerService")
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	PlayerService primaryPlayService;
	
	@Autowired
	PlayerService secondaryPlayerService;

	@Override
	public Player savePlayer1(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player2 savePlayer2(Player2 player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void savePlayer(Player player1, Player2 player2) {
		primaryPlayService.savePlayer1(player1);
		secondaryPlayerService.savePlayer2(player2);
	}

}
