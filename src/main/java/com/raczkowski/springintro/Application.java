package com.raczkowski.springintro;

import com.raczkowski.springintro.creational.singleton.SomeSpecificConfig;
import com.raczkowski.springintro.creational.singleton.SomeSpecificConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return (args) -> {
            SomeSpecificConfiguration configuration1 = SomeSpecificConfiguration.getInstance();
            SomeSpecificConfiguration configuration2 = SomeSpecificConfiguration.getInstance();

            System.out.println(configuration1 == configuration2);

            SomeSpecificConfig config1 = SomeSpecificConfig.CONFIG;
            SomeSpecificConfig config2 = SomeSpecificConfig.CONFIG;

            System.out.println(config1 == config2);




        };
    }
}
