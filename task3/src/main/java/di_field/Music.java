package di_field;

public class Music {
    private String musicMelody;

    Music(String musicMelody) {
        this.musicMelody = musicMelody;
    }

    public String playMelody() {
        return musicMelody;
    }
}
