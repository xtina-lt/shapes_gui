import java.awt.*;
import java.awt.Graphics;

public class Square extends Shape {
  public Square(Rectangle rectangle) {
    super(rectangle);
  }

  @Override
  public void draw(Graphics e) {
    e.fillRect(10, 10, (int)getWidth(), (int)getWidth());
  }
}


