package chat.io.devweek.domain.model;

public record Champion(
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
) {
}
