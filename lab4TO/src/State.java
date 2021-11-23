import java.awt.*;

public interface State {
    void contact(Person someone);

    Color getColor();
    void decreaseDuration();
}
