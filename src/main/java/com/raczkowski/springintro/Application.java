package com.raczkowski.springintro;

import com.raczkowski.springintro.structural.adapter.example1.BugattiVeyron;
import com.raczkowski.springintro.structural.adapter.example1.KPHAdapter;
import com.raczkowski.springintro.structural.adapter.example1.KPHtoMPHAdapter;
import com.raczkowski.springintro.structural.adapter.example1.Movable;
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
            Movable bugattiVeyron = new BugattiVeyron();

            KPHAdapter kphAdapter = new KPHtoMPHAdapter(bugattiVeyron);

            System.out.println(kphAdapter.getKPH());
        };
    }
}
