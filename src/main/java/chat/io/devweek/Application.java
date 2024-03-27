package chat.io.devweek;

import chat.io.devweek.application.ListChampionsUseCase;
import chat.io.devweek.domain.ports.ChampionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionUseCase(ChampionRepository repository) {
		return new ListChampionsUseCase(repository);
	}

}
