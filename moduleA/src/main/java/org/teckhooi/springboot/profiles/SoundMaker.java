package org.teckhooi.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class SoundMaker implements CommandLineRunner {

    @Autowired
    private SoundService soundService;

    public static void main(String[] args) {
        new SpringApplicationBuilder()
            .profiles("mock")   // use "default" or remove this line to load AwesomeSoundBoard
            .bannerMode(Banner.Mode.OFF)
            .sources(SoundMaker.class)
            .run(args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(soundService.toBeep("Hurray"));
    }
}