import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Cube extends Shape {
    public Cube(Rectangle rectangle) throws IOException {
        super(rectangle);
        BufferedImage checkimagefromfile = ImageIO.read(this.getClass().getResourceAsStream("images/Cube.png"));
        Image makeitreadytodraw = checkimagefromfile.getScaledInstance(Main.shapeWidth*95/100, Main.shapeWidth*95/100,Image.SCALE_DEFAULT);
        JLabel picture = new JLabel(new ImageIcon(makeitreadytodraw));
        Main.paneldraw.add(picture);
    }

    @Override
    public void draw(Graphics e) {
        e.fillRect(75, 75, 0, 0);
    }
}