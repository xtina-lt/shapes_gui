import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {

    public static String choice = "";
    static JFrame Jframe;
    static ShapesDrawingPanel paneldraw;
    static JComboBox<String> shapeslist;
    static JButton btn;

    static JTextField shapeWidthTxt, shapeHeightTxt;
    static JLabel shapelistcombo, shapeWidthLbl, shapeHeightLbl, txtLbl, selectionLbl;
    static int shapeWidth, shapeHeight;

    Main(){
        // main window
        paneldraw = new ShapesDrawingPanel(); 
        Jframe = new JFrame("Shapes program :)");
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Jframe.setLayout(null);
        Jframe.setBounds(100,100,645,470);
        Border br = BorderFactory.createLineBorder(Color.MAGENTA);
        Container c=Jframe.getContentPane();

        //panels
        JPanel panel=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        panel.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);

        // labels
        JLabel label=new JLabel("<html>Select shape from  shapes list combo and input shape width and height. Things that don't need height are: Circle,Sphere, Cube, and Square.</html>");
        JLabel label2=new JLabel("Panel 2");
        selectionLbl=new JLabel("");
        label.setBounds(10,50,250,150);
        label2.setBounds(120,50,200,50);

        // options
        shapelistcombo=new JLabel("Shape?");
        shapeWidthLbl=new JLabel("Width");
        shapeHeightLbl=new JLabel("Height");
        shapeslist=new JComboBox<>(new String[] {"Triangle","Cube","Circle","Torus","Square","Rectangle","Cylinder","Sphere","Cone"});
        shapeWidthTxt=new JTextField();
        shapeHeightTxt=new JTextField();

        // add options to panels
        panel3.add(shapelistcombo);
        panel3.add(shapeWidthLbl);
        panel3.add(shapeHeightLbl);
        panel3.add(shapeslist);
        panel3.add(shapeWidthTxt);
        panel3.add(shapeHeightTxt);
        panel3.add(btn);

        // bounds
        shapelistcombo.setBounds(10, 25, 130, 25);
        shapeslist.setBounds(110, 25, 130, 25);
        shapeslist.setSelectedIndex(0);
        shapeslist.addActionListener(new Selection());
        shapeWidthLbl.setBounds(10, 55, 130, 25);
        shapeWidthTxt.setBounds(110, 55, 130, 25);
        shapeHeightLbl.setBounds(10, 85, 130, 25);
        shapeHeightTxt.setBounds(110, 85, 130, 25);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setBackground(Color.MAGENTA);
        btn.setForeground(Color.WHITE);
        btn.setBounds(105, 115, 135, 25);
        selectionLbl.setBounds(120,50,200,50);

        // add other
        panel.add(label);
        panel4.add(selectionLbl);

        //user instructions backgrounds
        panel.setBackground(Color.ORANGE);
        panel3.setBackground(Color.PINK);
        panel4.setBackground(Color.CYAN);

        // bounds
        panel.setBounds(10,10,300,200);
        paneldraw.setBounds(320,5,300,250);
        panel3.setBounds(10,220,300,200);
        panel4.setBounds(320,260,300,160);

        // titles and borders
        paneldraw.setBorder(BorderFactory.createTitledBorder("Magic"));
        panel3.setBorder(BorderFactory.createTitledBorder("Actions selection Panel"));
        panel4.setBorder(BorderFactory.createTitledBorder("Shape selection and activities"));
        panel.setBorder(BorderFactory.createTitledBorder("Instructions"));

        //attatche panels and make visible
        c.add(paneldraw);
        c.add(panel);
        c.add(panel3);
        c.add(panel4);
        Jframe.setVisible(true);

    }



    public static void main (String[] args) {
        new Main();
    }

}