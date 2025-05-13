import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import javafx.scene.layout.GridPane;

class Chkdemo implements ItemListener{
     JLabel jl;
     Chkdemo(){
          JFrame jf = new JFrame("CheckBox");
          jf.setLayout(new FlowLayout());
          jf.setSize(500,500);
          jf.setVisible(true);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          JCheckBox jc1 = new JCheckBox("Pizza @ Rs.150");
          jf.add(jc1);
          jc1.addItemListener(this);

          JCheckBox jc2 = new JCheckBox("Burger @ Rs.732");
          jf.add(jc2);
          jc2.addItemListener(this);

          jl = new JLabel("Display");
          jf.add(jl);
     }

     public void itemStateChanged(ItemEvent ie){
          JCheckBox cb = (JCheckBox)ie.getItem();

          if(cb.isSelected()){
               jl.setText(cb.getText()+ "is selected");
          }
          else{
               jl.setText(null);
          }
     }

     public static void main(String[] args) {
          new Chkdemo();
     }

}