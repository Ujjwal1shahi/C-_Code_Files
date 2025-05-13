import java.awt.FlowLayout;
import javax.swing.*;


class test{
     public static void main(String[] args) {
          JFrame jf = new JFrame("new frame");
          jf.setBounds(500,300, 500, 500);
          jf.setLayout(new FlowLayout());
          jf.setVisible(true);
         
          JButton jb = new JButton("Done");
          jf.add(jb);
          jb.setBounds(50, 50, 100, 50);

          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}