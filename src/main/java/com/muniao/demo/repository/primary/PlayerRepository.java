package com.muniao.demo.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniao.demo.model.primary.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
