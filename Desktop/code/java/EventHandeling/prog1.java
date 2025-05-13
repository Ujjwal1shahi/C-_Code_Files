import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class prog1 implements ActionListener{

     JLabel jl;
     JButton jb1, jb2;

     prog1(){
          JFrame jf = new JFrame("Demo");
          jf.setSize(500, 500);
          jf.setLayout(new FlowLayout());
          jf.setVisible(true);

          
          jb1 = new JButton("Alpha");
          jf.add(jb1);
          jb1.addActionListener(this);

          
          jb2 = new JButton("Beta");
          jf.add(jb2);
          jb2.addActionListener(this);

          jl = new JLabel("No button");
          jf.add(jl);
     }
	 
	public void actionPerformed(ActionEvent ae) {
		Object ob = new Object();

          ob = ae.getSource();

          if(ob == jb1){
               jl.setText("Button 1");
          }
          if(ob == jb2){
               jl.setText("Button 2");
          }
	}

     public static void main(String[] args) {
          new prog1();
     }
}