package com.SEFALL2022.RESTApiTutorial.Controllers;

import com.SEFALL2022.RESTApiTutorial.Controllers.PlayerDTO;
import com.SEFALL2022.RESTApiTutorial.Models.Player;
import com.SEFALL2022.RESTApiTutorial.PlayerService;
import com.SEFALL2022.RESTApiTutorial.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerRestController {

    @Autowired
    private PlayerService playerService;

    @GetMapping(value = "/")
    public List<PlayerDTO> getAllPlayers() {
        return ObjectMapperUtils.mapAll(playerService.findAll(), PlayerDTO.class);
    }

    @GetMapping(value = "/byPlayerName/{playerName}")
    public PlayerDTO getPlayerByPlayerName(@PathVariable("playerName") String playerName) {
        return ObjectMapperUtils.map(playerService.findByPlayerName(playerName), PlayerDTO.class);
    }

    @GetMapping(value = "/orderByPoints")
    public List<PlayerDTO> findAllByOrderByPointsDesc() {
        return ObjectMapperUtils.mapAll(playerService.findAllByOrderByPointsDesc(), PlayerDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdatePlayer(@RequestBody PlayerDTO playerDTO) {
        playerService.saveOrUpdatePlayer(ObjectMapperUtils.map(playerDTO, Player.class));
        return new ResponseEntity("Player added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{playerName}")
    public ResponseEntity<?> deletePlayerByPlayerName(@PathVariable String playerName) {
        playerService.deletePlayerById(playerService.findByPlayerName(playerName).getId());
        return new ResponseEntity("Student deleted successfully", HttpStatus.OK);
    }

}