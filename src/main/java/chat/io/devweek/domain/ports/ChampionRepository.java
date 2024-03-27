package chat.io.devweek.domain.ports;

import chat.io.devweek.domain.adapters.out.ChampionEntity;

import java.util.List;
import java.util.Optional;

public interface ChampionRepository {
    List<ChampionEntity> findAll();
    Optional<ChampionEntity> findOne(Long id);
}
