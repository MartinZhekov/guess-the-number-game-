package org.martinzhekov.utill;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Created by martinzhekov on 21.11.20
 */

@NoArgsConstructor(access = AccessLevel.PACKAGE)
public final class GameMappings {
    // == constants ==
    public static final String PLAY = "play";
    public static final String REDIRECT_PLAY = "redirect:/" + PLAY;

}
