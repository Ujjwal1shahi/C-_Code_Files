import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;


class q1 {
     public static void main(String[] args) {
          JFrame Jf = new JFrame("Mera Frame");
          Jf.setLayout(new GridBagLayout());
          Jf.setSize(500,500);
          Jf.setVisible(true);
          JButton Jb = new JButton("Click me");
          JButton Jb2 = new JButton("Submit");
          
          Jb.setBounds(50, 50, 100, 50);
          Jb2.setBounds(50, 50, 100, 50);
          Jf.add(Jb);
          Jf.add(Jb2);
          Jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}