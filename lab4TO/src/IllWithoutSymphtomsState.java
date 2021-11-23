import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class IllWithoutSymphtomsState implements State{
    private Person person;
    private Color color = Color.orange;
    private int duration;
    IllWithoutSymphtomsState()
    {
        this.duration=generateDuration();
    }
    IllWithoutSymphtomsState(Person person)
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
    public void decreaseDuration()
    {
        this.duration--;
        if(this.duration==0)
        {
            HealthyImmuneState healthy =new HealthyImmuneState(this.person);
            this.person.setState(healthy);
        }
    }
    public int getDuration() {
        return duration;
    }

    public int generateDuration()
    {
        int duration = ThreadLocalRandom.current().nextInt(500, 775);
        return duration;
    }

    @Override
    public void contact(Person someone) {
        return;
    }


}