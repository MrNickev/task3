package di_setter;

public class Vehicle {
    private String sound;

    Vehicle(String sound) {
        this.sound = sound;
    }

    public String startEngine() {
        return sound;
    }
}
