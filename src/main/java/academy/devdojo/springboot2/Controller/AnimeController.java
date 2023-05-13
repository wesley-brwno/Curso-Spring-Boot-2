package academy.devdojo.springboot2.Controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping("list")
    public List<Anime> list() {
        //localhost:8080/anime/list
        log.info(dateUtil.formatLocalDataTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no Hero"), new Anime("One Piece"));
    }
}
