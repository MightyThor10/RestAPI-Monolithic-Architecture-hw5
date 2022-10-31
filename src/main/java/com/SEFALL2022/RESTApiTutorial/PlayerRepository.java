package com.SEFALL2022.RESTApiTutorial;

import com.SEFALL2022.RESTApiTutorial.Models.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {

    Player findByPlayerName(String name);

    List<Player> findAllByOrderByPointsDesc();

}

