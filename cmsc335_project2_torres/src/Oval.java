import java.awt.*;
import java.awt.Graphics;

public class Oval extends Shape {
    public Oval(Rectangle rectangle) {
        super(rectangle);
    }
    @Override
    public void draw(Graphics g) {
        g.fillOval(10, 10, (int)getWidth(), (int)getWidth());
    }
}