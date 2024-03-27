package chat.io.devweek.domain.adapters.out;

import jakarta.persistence.*;

@Entity(name = "champions")
public class ChampionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    String role;

    @Column
    @Lob
    String lore;

    @Column
    String imageUrl;

    public ChampionEntity() {}
}