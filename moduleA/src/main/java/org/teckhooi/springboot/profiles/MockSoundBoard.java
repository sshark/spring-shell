package org.teckhooi.springboot.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mock")
public class MockSoundBoard implements SoundBoard {
    @Override
    public String send(String sound) {
        return "Mocking sound " + sound;
    }
}
