import javax.swing.*;

public class DrawRect {
    public static void draw(People population) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        StorageSnapshots storage = new StorageSnapshots();
        int t=0;
        while(true)
        {
            window.getContentPane().add(new MyPanel(population));
            window.setVisible(true);


            try {
                Thread.sleep(166);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t++;
            population.enter(Main.E);
            population.interactions();
            People.Snapshot snap =population.createSnapshot();
            storage.addSnapshot(t,snap);

        }

    }
}
