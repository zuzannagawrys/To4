import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    private People population;
    MyPanel(People population)
    {
        this.population=population;
    }
    private int squareX = 0;
    private int squareY = 0;
    private int squareW = (int) Main.N*100;
    private int squareH = (int) Main.M*100;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        g.setColor(Color.RED);
        g.drawRect(squareX,squareY,squareW,squareH);
        int ppW =5;
        int ppH =5;
        for(int i=0; i<population.getPeople().size();i++)
        {
            int ppX = (int)population.getPeople().get(i).getSpeed().getX();
            int ppY =(int) population.getPeople().get(i).getSpeed().getY();
            g.setColor(population.getPeople().get(i).getState().getColor());
            g.fillRect(ppX,ppY,ppW,ppH);
        }

    }
}