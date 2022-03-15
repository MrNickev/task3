package di_field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di_field")
public class MusicConfig {
    @Bean
    public Music music() {
        return new Music("Imagine Imperial Marsh playing. It's something like tum-tum-tum-tum-tu-tum-tum-tu-tum");
    }
}
