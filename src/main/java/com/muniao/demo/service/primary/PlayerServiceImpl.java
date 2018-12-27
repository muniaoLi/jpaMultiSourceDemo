package com.muniao.demo.service.primary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.muniao.demo.model.primary.Player;
import com.muniao.demo.model.secondary.Player2;
import com.muniao.demo.repository.primary.PlayerRepository;
import com.muniao.demo.service.PlayerService;

@Service("primaryPlayService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	PlayerRepository playDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Player savePlayer1(Player player) {
		return playDao.save(player);
	}

	@Override
	public Player2 savePlayer2(Player2 player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePlayer(Player player1, Player2 player2) {
		// TODO Auto-generated method stub
		
	}

}
