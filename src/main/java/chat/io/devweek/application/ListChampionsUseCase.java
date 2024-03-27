package chat.io.devweek.application;

import chat.io.devweek.domain.adapters.out.ChampionEntity;
import chat.io.devweek.domain.ports.ChampionRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionRepository repository) {
    public List<ChampionEntity> findAll() {
        return repository.findAll();
    }

}
