import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Test implements ActionListener{
     JLabel jl;
     JButton jb1,jb2;

     Test(){
          JFrame jf = new JFrame("Event Handeling 1 ");
          jf.setSize(500,500);
          jf.setLayout(new GridBagLayout());
          jf.setVisible(true);

          jb1 = new JButton("Alpha");
          jf.add(jb1);
          jb1.addActionListener(this);

          jb2 = new JButton("Beta");
          jf.add(jb2);
          jb2.addActionListener(this);

          jl = new JLabel("TEXT");
          jf.add(jl);

          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void actionPerformed(ActionEvent ae) {
          Object ob = new Object();
          ob = ae.getSource();

          if(ob == jb1){
               jl.setText("ALPHA");
          }
          if(ob == jb2){
               jl.setText("BETA");
          }
     }

     public static void main(String[] args) {
          new Test();
     }
}