package org.teckhooi.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoundServiceImpl implements SoundService {

    @Autowired
    public SoundBoard soundBoard;

    @Override
    public String toBeep(String sound) {
        return soundBoard.send(sound);
    }
}
