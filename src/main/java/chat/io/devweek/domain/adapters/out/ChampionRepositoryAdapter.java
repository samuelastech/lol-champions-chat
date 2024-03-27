package chat.io.devweek.domain.adapters.out;

import chat.io.devweek.domain.model.Champion;
import chat.io.devweek.domain.ports.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChampionRepositoryAdapter implements ChampionRepository {

    @Autowired
    private ChampionRepositoryJPA repository;

    @Override
    public List<ChampionEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ChampionEntity> findOne(Long id) {
        return repository.findById(id);
    }
}
