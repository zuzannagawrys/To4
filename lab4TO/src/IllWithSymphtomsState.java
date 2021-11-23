import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class IllWithSymphtomsState implements State{
    private Person person;
    private Color color = Color.RED;

    private int duration;

    IllWithSymphtomsState()
    {
        this.duration=generateDuration();
    }
    IllWithSymphtomsState(Person person)

    {
        this.person = person;
        this.duration=generateDuration();
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
    public int getDuration() {
        return duration;
    }
    public int generateDuration()
    {
        int duration = ThreadLocalRandom.current().nextInt(20, 31);
        return duration;
    }
    public void decreaseDuration()
    {
        this.duration--;
        if(this.duration==0)
        {
            HealthyImmuneState healthy =new HealthyImmuneState(this.person);
            this.person.setState(healthy);
        }
    }

    @Override
    public void contact(Person someone) {
        return;
    }


}