import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

class ShapesDrawingPanel extends JPanel implements ActionListener{
    Shape currentshape=null;

    ShapesDrawingPanel() {
        Main.btn=new JButton("Draw Me");
        Main.btn.setPreferredSize(new java.awt.Dimension());
        Main.btn.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            super.paintComponent(g);
            currentshape.setColor(g);
            currentshape.draw(g);
            } catch(Exception e) {
                System.out.println(e);
            }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(210, 210);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        try {
            Shapedraw(); 
            Rectangle rectangle = new Rectangle(0, 0, Main.shapeWidth, Main.shapeHeight);
            
        if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("square")){
                Main.paneldraw.removeAll();
                Main.shapeHeightTxt.setText("");
                currentshape=new Square(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();  
            }
            else  if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("circle")){
                Main.paneldraw.removeAll();
                Main.shapeHeightTxt.setText("");
                currentshape=new Oval(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();  
            }
            
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("triangle")){
                Main.paneldraw.removeAll();
                currentshape=new Triangle(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();  
            }
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("cube")){
                Main.paneldraw.removeAll();
                Main.shapeHeightTxt.setText("");
                currentshape=new Cube(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate(); 
            }
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("rectangle")){
                Main.paneldraw.removeAll();
                currentshape=new Rectangleshape(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();   
            }
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("sphere")){
                Main.paneldraw.removeAll();
                Main.shapeHeightTxt.setText("");
                currentshape=new Sphere(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate(); 
            }
            
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("cone")){
                Main.paneldraw.removeAll();
                currentshape=new Cone(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();   
            }
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("torus")){
                Main.paneldraw.removeAll();
                currentshape=new Torus(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();  
            } 
            else if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("cylinder")){
                Main.paneldraw.removeAll();
                currentshape=new Cylinder(rectangle);
                Main.paneldraw.repaint();
                Main.paneldraw.validate();  
            }           
            
            }catch(ShapeExceedsBounds o) { 
                JOptionPane.showMessageDialog(null, o.getMessage());
            } catch (IOException e) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            }
        }

    class ShapeExceedsBounds extends Exception {
        public ShapeExceedsBounds(String errorMessage) {
            super(errorMessage);   
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ShapesDrawingPanel.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(null, "Image does not exist" + path);
            return null;
        }
    } 

    public void Shapedraw() throws ShapeExceedsBounds {
        if(((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("circle")
            || ((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("sphere")
            || ((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("square")
            || ((String)Main.shapeslist.getSelectedItem()).equalsIgnoreCase("cube")){
            try {
                Main.shapeWidth=Integer.parseInt(Main.shapeWidthTxt.getText());
                if((Main.shapeWidth)>235 || (Main.shapeHeight)>235 || Main.shapeWidth<0)
                    throw new ShapeExceedsBounds("Height and Width can't exceed 210 * 210 which is the drawing panel dimensions");
            
                }catch(ShapeExceedsBounds o) {
                        JOptionPane.showMessageDialog(null, o.getMessage());
                        new Main();
                }catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Height or width can only contain numbers (integers)");
                        new Main();
                }
        
        } else {
            try {
                Main.shapeWidth=Integer.parseInt(Main.shapeWidthTxt.getText());
                Main.shapeHeight=Integer.parseInt(Main.shapeHeightTxt.getText());
                if((Main.shapeWidth)>235 || (Main.shapeHeight)>235 || Main.shapeWidth<0 || Main.shapeHeight<0)
                    throw new ShapeExceedsBounds("Height and Width can't exceed 210 * 210 which is the drawing panel dimensions");
                    
            }catch(ShapeExceedsBounds o) {
                    JOptionPane.showMessageDialog(null, o.getMessage());
                    new Main();
            }catch(NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Height or width can only contain numbers (integers)");
                    new Main();
            }    
        }


    }
}