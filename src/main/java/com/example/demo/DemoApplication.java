package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = userRepository.findByEmail("heguangxiao@gmail.com");
        if (user == null) {
            user = new User();
            user.setEmail("heguangxiao@gmail.com");
            user.setPassword(passwordEncoder.encode("Acmalinh1@"));
            user = userRepository.save(user);
            System.out.println(user);
        }
    }

}
