import java.awt.*;

public interface State {

    Color getColor();
    void decreaseDuration();

    void contact(Person someone);
}
