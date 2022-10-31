package com.SEFALL2022.RESTApiTutorial;

import com.SEFALL2022.RESTApiTutorial.Models.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findByPlayerName(String name);

    List<Player> findAllByOrderByPointsDesc();

    Player saveOrUpdatePlayer(Player player);

    void deletePlayerById(String id);

}
