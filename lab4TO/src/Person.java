import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Person{
    private State state;
    private Vector2D speed;
    private Map <Person, Integer> contacts;
    Person(State state)
    {
        this.state=state;
        this.speed=new Vector2D();
        this.contacts = new HashMap<>();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
         this.state = state;
    }

    public Vector2D getSpeed() {
        return speed;
    }

    public void setSpeed(Vector2D speed) {
        this.speed = speed;
    }
    public double proximity(Person someone)
    {
        return Math.sqrt(Math.abs(this.speed.getX()-someone.speed.getX())+Math.abs(this.speed.getY()-someone.speed.getY()));
    }

    public Map<Person, Integer> getContacts() {
        return contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getState().equals(person.getState()) && getSpeed().equals(person.getSpeed()) && getContacts().equals(person.getContacts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getState(), getSpeed());
    }


}
