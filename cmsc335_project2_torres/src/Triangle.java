import java.awt.*;

public class Triangle extends Shape {
    public Triangle(Rectangle rectangle) {
       super(rectangle);
    }

    @Override
    public void draw(Graphics g) {  
        Polygon triangle = new Polygon();
        triangle.addPoint(-(int)getWidth()/2 + 125, 243);
        triangle.addPoint(125, -(int)getHeight() + 243);
        triangle.addPoint((int)getWidth()/2 + 125, 243);
        g.fillPolygon(triangle);
    }
}