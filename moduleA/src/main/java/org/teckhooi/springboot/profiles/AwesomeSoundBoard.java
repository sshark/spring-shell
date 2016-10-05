package org.teckhooi.springboot.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class AwesomeSoundBoard implements SoundBoard {
    @Override
    public String send(String sound) {
        return "Awesome!!! " +  sound;
    }
}