package com.muniao.demo.service.secondary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muniao.demo.model.primary.Player;
import com.muniao.demo.model.secondary.Player2;
import com.muniao.demo.repository.secondary.Player2Repository;
import com.muniao.demo.service.PlayerService;

@Service("secondaryPlayerService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	Player2Repository playerDao;
	
	@Override
	public Player savePlayer1(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Player2 savePlayer2(Player2 player) {
		return playerDao.save(player);
	}

	@Override
	public void savePlayer(Player player1, Player2 player2) {
		// TODO Auto-generated method stub
		
	}

}
