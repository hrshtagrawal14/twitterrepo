package com.liftoff.application.twitter;

import com.liftoff.application.twitter.model.UserInfo;
import com.liftoff.application.twitter.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TwitterApplication {

    public static void main(String[] args) {

        SpringApplication.run(TwitterApplication.class, args);


    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new UserInfo("harshit", 1,"harshit@gmail.com", new String[]{"2", "3"}));
            repository.save(new UserInfo("Rahul",2, "rahul@gmail.com", new String[]{"4", "3"}));
            repository.save(new UserInfo("Raghav", 3,"raghav@gmail.com", new String[]{"5", "3"}));
            repository.save(new UserInfo("Mayank",4, "mayank@gmail.com", new String[]{"1", "2"}));
            repository.save(new UserInfo("Tushar",5, "tushar@gmail.com", new String[]{"1", "6"}));
            repository.save(new UserInfo("Karan",6, "karan@gmail.com", new String[]{"4", "2"}));

        };
    }
}
