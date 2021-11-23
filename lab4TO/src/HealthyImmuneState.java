import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class HealthyImmuneState implements State{
    private Person person;
    private Color color= Color.GREEN;
    private int duration;

    public HealthyImmuneState() {this.duration=1; }
    public HealthyImmuneState(Person person) {
        this.person = person;
        this.duration=1;
    }

    public Color getColor() {
        return color;
    }

    public Person getPearson() {
        return person;
    }

    public void setPearson(Person person) {
        this.person = person;
    }

    @Override
    public void decreaseDuration() {
        return;
    }

    @Override
    public void contact(Person someone) {
        return;
    }




}
