import java.awt.*;
import java.awt.Graphics;

public abstract class Shape extends Rectangle {

    public Shape(Rectangle rectangle) {
        super(rectangle);
    }

    public void setColor(Graphics g) {
        g.setColor(Color.BLACK);
    }

    double volPrism(int length,int depth){
        return length*width*depth;
    }

    double volShere(int radius){
        return (4/3)*Math.PI*radius*radius*radius;
    }

    double areaRect(int length, int width){
        return length*width;
    }

    double areaCirle(int radius ){
        return Math.PI*radius*radius;
    }

    public abstract void draw(Graphics e);
}