package org.martinzhekov.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess {

    //== constants ==
    private static final Logger logger = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    @EventListener(ContextRefreshedEvent.class)
    public void onApplicationEvent() {
        logger.info("Container ready for use.");
    }
}

//@Component
//public class ConsoleNumberGuess implements ApplicationListener<ContextRefreshedEvent> {
//
//    //== constants ==
//    private static final Logger logger = LoggerFactory.getLogger(ConsoleNumberGuess.class);
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        logger.info("Container ready for use.");
//    }
//}
