package com.example.foyerwiembenaraar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FoyerWiemBenAraarApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoyerWiemBenAraarApplication.class, args);
    }

}
