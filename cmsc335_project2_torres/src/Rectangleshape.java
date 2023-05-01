import java.awt.*;
import java.awt.Graphics;

public class Rectangleshape extends Shape {
    public Rectangleshape(Rectangle rectangle) {
       super(rectangle);
    }
    @Override
   public void draw(Graphics g) {
        g.fillRect(10, 10, (int)getWidth(), (int)getHeight());
    }
}