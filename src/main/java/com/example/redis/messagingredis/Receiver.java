package com.example.redis.messagingredis;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class Receiver {
    private AtomicInteger couter = new AtomicInteger();

    public void receiveMessage(String message) {
        log.info("Recieved <" + message + ">");
        couter.incrementAndGet();
    }

    public int getCount() {
        return couter.get();
    }
}
