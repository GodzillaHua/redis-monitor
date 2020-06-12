package io.panda.devops.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author godzillahua
 **/
@SpringBootApplication
@EnableScheduling
public class RedisMonitorApplicationServer {

    public static void main(String[] args) {
        SpringApplication.run(RedisMonitorApplicationServer.class, args);
    }
}
