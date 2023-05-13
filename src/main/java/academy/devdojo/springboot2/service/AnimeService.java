package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class AnimeService {

    List<Anime> animes = List.of(new Anime(1L,"Boku no Hero"), new Anime(2L,"One Piece"));
    // private final AnimeRepository animeRepository
    public List<Anime> listAll() {
        return animes;
    }

    public Anime findByid(Long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }
}
