package ch.zuehlke.fullstack.ConnectZuehlke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class ConnectZuehlkeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectZuehlkeApplication.class, args);
    }

}

