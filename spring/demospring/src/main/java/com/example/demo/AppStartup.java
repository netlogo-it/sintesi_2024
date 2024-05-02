package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class AppStartup implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("*******************");
        log.info("CIAO SONO FRANCESCO");
        log.info("*******************");
    }

}
