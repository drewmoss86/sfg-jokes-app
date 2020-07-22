package guru.springframework.sfgjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfig {
//    @Bean --> commented out to test XML based configuration setup
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
