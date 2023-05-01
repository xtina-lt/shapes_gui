import java.awt.event.*;
import javax.swing.JComboBox;


class Selection implements ActionListener{
   @Override
   public void actionPerformed(ActionEvent e){
      JComboBox cb = (JComboBox)e.getSource();
      Main.choice = (String)cb.getSelectedItem();
      Main.selectionLbl.setText("You have chosen: "+Main.choice);
   }
}
