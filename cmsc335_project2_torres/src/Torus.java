import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Torus extends Shape {
    
    public Torus(Rectangle rectangle) throws IOException {
        super(rectangle);
        BufferedImage checkimagefromfile = ImageIO.read(this.getClass().getResourceAsStream("images/Torus.png"));
        Image makeitreadytodraw = checkimagefromfile.getScaledInstance(Main.shapeWidth*95/100, Main.shapeHeight*95/100,Image.SCALE_DEFAULT);
        JLabel picture = new JLabel(new ImageIcon(makeitreadytodraw));
        Main.paneldraw.add(picture);
    }

    double volTorus(){
        return 2*Math.PI*Math.PI*Main.shapeWidth*Main.shapeHeight*Main.shapeHeight;
    }
    
    @Override
    public void draw(Graphics g) {
        g.fillRect(75, 75, 0, 0);
    }
}