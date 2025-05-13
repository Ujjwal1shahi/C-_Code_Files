import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Add implements ActionListener{
     JTextField jt1, jt2;
     JLabel jl;
     JButton jb1, jb2;

     Add(){
          JFrame jf = new JFrame();
          jf.setSize(500, 500);
          jf.setLayout(new GridLayout(10,10));
          jf.setVisible(true);
          
          ImageIcon i = new ImageIcon("IMG.png");
          JLabel jl1 = new JLabel("HOVERGLASS", i, JLabel.CENTER);
          jf.add(jl1);

          JLabel j1 = new JLabel("First No.");
          jf.add(j1);

          jt1 = new JTextField();
          jf.add(jt1);

          JLabel j2 = new JLabel("Second No.");
          jf.add(j2);

          jt2 = new JTextField();
          jf.add(jt2);

          JLabel j3 = new JLabel("Result");
          jf.add(j3);

          jl = new JLabel();
          jf.add(jl);

          jb1 = new JButton("ADD");
          jf.add(jb1);
          jb1.addActionListener(this);

          jb2 = new JButton("SUB");
          jf.add(jb2);
          jb2.addActionListener(this);

          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void actionPerformed(ActionEvent ae){
          Object ob = new Object();
          ob = ae.getSource();

          int x = Integer.parseInt(jt1.getText());
          int y = Integer.parseInt(jt2.getText());

          if(ob == jb1){
               jl.setText(Integer.toString(x+y));
          }
          if(ob == jb2){
               jl.setText(Integer.toString(x-y));
          }
     }

     public static void main(String[] args) {
          new Add();
     }
}