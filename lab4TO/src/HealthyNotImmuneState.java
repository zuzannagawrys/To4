import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HealthyNotImmuneState implements State{
    private Person person;
    Color color = Color.BLUE;
    private int duration;

    HealthyNotImmuneState() {this.duration=1; }
    HealthyNotImmuneState(Person person)
    {
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
        if(someone.getState().getColor().equals(Color.RED))
        {
            int r;
            Random rand = new Random();
            r = rand.nextInt(2);
            if(r==0)
            {
                IllWithSymphtomsState sick = new IllWithSymphtomsState(this.person);
                this.person.setState(sick);

            }
            else
            {
                IllWithoutSymphtomsState sick = new IllWithoutSymphtomsState(this.person);
                this.person.setState(sick);

            }
        }
        else
        {
            if(someone.getState().getColor().equals(Color.ORANGE))
            {
                int r;
                Random rand = new Random();
                r = rand.nextInt(4);
                if(r==2)
                {
                    IllWithSymphtomsState sick = new IllWithSymphtomsState(this.person);
                    this.person.setState(sick);

                }
                if(r==3)
                {
                    IllWithoutSymphtomsState sick = new IllWithoutSymphtomsState(this.person);
                    this.person.setState(sick);

                }
            }
        }
    }


}