import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener {

    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton reset;

    JTextField op1;
    JTextField op2;
    JTextField result;

    Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setSize(500, 500);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jl1 = new JLabel("Enter first no.");
        op1 = new JTextField(20);
        JLabel jl2 = new JLabel("Enter second no.");
        op2 = new JTextField(20);

        jf.add(op1);
        jf.add(jl1);

        jf.add(op2);
        jf.add(jl2);

        add = new JButton("ADD");
        jf.add(add);
        add.addActionListener(this);

        sub = new JButton("SUB");
        jf.add(sub);
        sub.addActionListener(this);

        mul = new JButton("MUL");
        jf.add(mul);
        mul.addActionListener(this);

        div = new JButton("DIV");
        jf.add(div);
        div.addActionListener(this);

        result = new JTextField(20);
        jf.add(result);
    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(op1.getText());
        int b = Integer.parseInt(op2.getText());

        Object obj = new Object();
        obj = ae.getSource();
        if (obj == add) result.setText(a + b);

        if (obj == sub) result.setText(a - b);

        if (obj == mul) result.setText(a * b);

        if (obj == div) result.setText(a / b);
    }

    public static void main(String args[]) {
        new Calculator();
    }
}
