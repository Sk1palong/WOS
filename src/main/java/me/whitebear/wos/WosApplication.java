package me.whitebear.wos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WosApplication {

    public static void main(String[] args) {
        SpringApplication.run(WosApplication.class, args);
    }

}
