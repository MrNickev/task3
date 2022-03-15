package di_field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class musicPlayer {
    @Autowired
    private Music music;

    public String playMusic() {
        return music.playMelody();
    }
}
