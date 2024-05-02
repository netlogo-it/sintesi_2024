package com.example.demo;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ExampleTask {
    
    @Scheduled(cron="${executetask.cron}")
    public void execute(){
        log.info("Esecuzione: {}",LocalDateTime.now());
    }

}
