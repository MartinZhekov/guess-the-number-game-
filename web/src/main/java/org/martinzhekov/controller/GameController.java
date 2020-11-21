package org.martinzhekov.controller;

import lombok.extern.slf4j.Slf4j;
import org.martinzhekov.service.GameService;
import org.martinzhekov.utill.AttributeNames;
import org.martinzhekov.utill.GameMappings;
import org.martinzhekov.utill.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by martinzhekov on 21.11.20
 */

@Slf4j
@Controller
public class GameController {
    // == fields ==
    private final GameService gameService;

    // == constructor ==
    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    // request methods ==
    @GetMapping(GameMappings.PLAY)
    public String play(Model model) {
        model.addAttribute(AttributeNames.MAIN_MESSAGE, this.gameService.getMainMessage());
        model.addAttribute(AttributeNames.RESULT_MESSAGE, this.gameService.getResultMessage());
        log.info("model = {}", model);

        if (this.gameService.isGameOver()) {
            return ViewNames.GAME_OVER;
        }
        return ViewNames.PLAY;
    }

    @PostMapping(GameMappings.PLAY)
    public String processMessage(@RequestParam int guess){
        log.info("guess = {}", guess);
        this.gameService.checkGuess(guess);
        return GameMappings.REDIRECT_PLAY;
    }

    @GetMapping(GameMappings.RESTART)
    public String restart(){
        this.gameService.reset();
        return GameMappings.REDIRECT_PLAY;
    }
}
