package di_field;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FieldApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MusicConfig.class);
        var player = context.getBean(Music.class);
        System.out.println(player.playMelody());
    }
}
