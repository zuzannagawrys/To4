import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;

public class Vector2D{
    private int length;
    private int angle;
    private int x;
    private int y;

    Vector2D()
    {
        this.x=generateX();
        this.y=generateY();
        this.length=generateSpeed();
        this.angle=generateAngle();
    }
    public void generateNewLocation()
    {
        int movement;
        int x1, y1;
        int a=0;
            do {
            this.length=generateSpeed();
            movement = this.length*4;
            this.angle=generateAngle();
            x1=(int)(this.x + movement*Math.cos((double)this.angle));
            y1=(int)(this.y + movement*Math.sin((double)this.angle));
            a++;
            System.out.println(a);
        }while(x1<0 || x1>Main.N*100 || y1<0 || y1>Main.M*100);
        this.x=x1;
        this.y=y1;
    }
    public int generateSpeed()
    {
        int speed = ThreadLocalRandom.current().nextInt(0, 250);
        return speed;
    }
    public int generateAngle()
    {
        int angle = ThreadLocalRandom.current().nextInt(0, 360);
        return angle;
    }
    public int generateX()
    {
        int x = ThreadLocalRandom.current().nextInt(0, Main.N*100);
        return x;
    }
    public int generateY()
    {
        int y = ThreadLocalRandom.current().nextInt(0, Main.M*100);
        return y;
    }
    public double[] getComponents()
    {
        double [] components= {this.length,this.angle,this.x, this.y};
        return components;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
