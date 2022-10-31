package com.SEFALL2022.RESTApiTutorial;

import com.SEFALL2022.RESTApiTutorial.Models.Player;
import com.SEFALL2022.RESTApiTutorial.PlayerRepository;
import com.SEFALL2022.RESTApiTutorial.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Player findByPlayerName(String name) {
        return playerRepository.findByPlayerName(name);
    }

    @Override
    public List<Player> findAllByOrderByPointsDesc() {
        return playerRepository.findAllByOrderByPointsDesc();
    }

    @Override
    public Player saveOrUpdatePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayerById(String id) {
        playerRepository.deleteById(id);
    }
}
