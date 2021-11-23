import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class People {
    private ArrayList <Person> people;
    People(){
        this.people= new ArrayList<>();
    }
    public void createPopulationWithPartialImmunity(int B)
    {
        int r;
        Random rand = new Random();

        for(int i=0; i<B; i++)
        {
            r = rand.nextInt(2);
            if(r==0)
            {
                HealthyImmuneState healthy = new HealthyImmuneState();
                Person person = new Person(healthy);
                healthy.setPearson(person);
                this.people.add(person);
            }
            else
            {
                HealthyNotImmuneState healthy = new HealthyNotImmuneState();
                Person person = new Person(healthy);
                healthy.setPearson(person);
                this.people.add(person);
            }

        }
    }
    public void createPopulationWithNoImmunity(int B)
    {
        for(int i=0; i<B; i++)
        {
            HealthyNotImmuneState healthy = new HealthyNotImmuneState();
            Person person = new Person(healthy);
            healthy.setPearson(person);
            this.people.add(person);

        }
    }
    public void enter(int number)
    {
        int r;
        Random rand = new Random();
        for(int i=0; i<number; i++)
        {
            r = rand.nextInt(20);
            if(r==0)
            {
                IllWithSymphtomsState ill = new IllWithSymphtomsState();
                Person person = new Person(ill);
                ill.setPearson(person);
                this.people.add(person);
            }
            else
            {
                if(r==1)
                {
                    IllWithoutSymphtomsState ill = new IllWithoutSymphtomsState();
                    Person person = new Person(ill);
                    ill.setPearson(person);
                    this.people.add(person);
                }
                else
                {
                    HealthyNotImmuneState healthy = new HealthyNotImmuneState();
                    Person person = new Person(healthy);
                    healthy.setPearson(person);
                    this.people.add(person);
                }
            }
        }
    }
    public void interactions()
    {
        int e;
        Random randd = new Random();
        for(int i =0;i<this.people.size();i++)
        {
            Person current=this.people.get(i);
            if(current.getSpeed().getX()==Main.N*100 || current.getSpeed().getY()==Main.M*100)
            {
                e = randd.nextInt(2);
                if(e==0)
                {
                    this.people.remove(i);
                }
            }
            this.people.get(i).getState().decreaseDuration();
            this.contacting(this.people.get(i));
            this.people.get(i).getSpeed().generateNewLocation();

        }
    }
    public void contacting(Person someone)
    {
        for(int i =0;i<this.people.size();i++)
        {
            if(someone.proximity(this.people.get(i))<200)
            {
                if(someone.getContacts().containsKey(this.people.get(i)))
                {
                    int a =someone.getContacts().get(this.people.get(i));
                    a++;
                    if(a>=75)
                    {
                        someone.getState().contact(this.people.get(i));
                    }
                    someone.getContacts().put(this.people.get(i),a);
                }
                else
                {
                    someone.getContacts().put(this.people.get(i),1);
                }
            }
            else
            {
                someone.getContacts().remove(this.people.get(i));
            }
        }
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}
