import java.io.Serializable;

public abstract class Shape implements Serializable {
    String Color;
    public abstract float calculateArea();
    public abstract float calculatePerimeter();
    public void setColor(String c) {
        Color = c;
    }
}
