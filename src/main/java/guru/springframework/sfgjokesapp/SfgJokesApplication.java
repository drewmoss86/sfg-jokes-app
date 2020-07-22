package guru.springframework.sfgjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ChuckConfig.xml")
public class SfgJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgJokesApplication.class, args);
    }

}
