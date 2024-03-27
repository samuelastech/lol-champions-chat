package chat.io.devweek.application;

import chat.io.devweek.domain.adapters.out.ChampionEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase useCase;

    @Test
    public void testListChampions() {
        List<ChampionEntity> champions = useCase.findAll();
        Assertions.assertEquals(12, champions.size());
    }
}
