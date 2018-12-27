package com.muniao.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.muniao.demo.model.primary.Player;
import com.muniao.demo.model.secondary.Player2;
import com.muniao.demo.repository.primary.PlayerRepository;
import com.muniao.demo.repository.secondary.Player2Repository;
import com.muniao.demo.service.PlayerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaMultiSourceDemoApplicationTests {

	@Autowired
	PlayerRepository playerDao;
	
	@Autowired
	Player2Repository playerDao2;
	
	@Autowired
	PlayerService primaryPlayService;
	
	@Autowired
	PlayerService secondaryPlayerService;
	
	@Autowired
	PlayerService commonPlayerService;
	
	@Test
	public void test4() {
		Player p1 = new Player();
		p1.setName("运动员6");
		
		Player2 p2 = new Player2();
		p2.setName("运动员5");
		
		commonPlayerService.savePlayer(p1, p2);
		
		System.out.println("");
	}
	
	//@Test
	public void test3() {
		Player2 p = new Player2();
		p.setName("运动员4");
		p = secondaryPlayerService.savePlayer2(p);
		System.out.println("");
	}
	
	//@Test
	public void test2() {
		Player p = new Player();
		p.setName("运动员3");
		p = primaryPlayService.savePlayer1(p);
		System.out.println("");
	}
	
	//@Test
	public void test1() {
		Player p = new Player();
		p.setName("运动员2");
		playerDao.save(p);
		
		Player2 p2 = new Player2();
		p2.setName("御东园2");
		playerDao2.save(p2);
		
	}
}

