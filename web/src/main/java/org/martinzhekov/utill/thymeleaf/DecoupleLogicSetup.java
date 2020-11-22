package org.martinzhekov.utill.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import java.nio.charset.StandardCharsets;

/**
 * Created by martinzhekov on 22.11.20
 */

@Slf4j
@Component
public class DecoupleLogicSetup {
    // == fields ==
    private final SpringResourceTemplateResolver templateResolver;

    // == constructor ==

    public DecoupleLogicSetup(SpringResourceTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    // == init ==
    @PostMapping
    public void init(){
        this.templateResolver.setPrefix("classpath:/templates/");
        this.templateResolver.setSuffix(".html");
        this.templateResolver.setUseDecoupledLogic(true);
        log.info("Decoupled template logic enabled");
    }
}
