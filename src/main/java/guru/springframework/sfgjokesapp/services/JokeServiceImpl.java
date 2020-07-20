package guru.springframework.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes cnq;

    public JokeServiceImpl() {
        //instantiating JokeServiceImpl object inside no-arg constructor improves
        // efficiency...
        this.cnq = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return cnq.getRandomQuote();
    }
}
