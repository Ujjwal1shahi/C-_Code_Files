import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class prog2 implements ActionListener {
     JFrame frame;
     JTextField num1, num2;
     JLabel result;
     JButton addButton, subtractButton;

     prog2() {
            frame = new JFrame("Sum and Subtraction");
            frame.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            gbc.gridx = 0;
            gbc.gridy = 0;
            frame.add(new JLabel("Number 1:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            num1 = new JTextField(10);
            frame.add(num1, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            frame.add(new JLabel("Number 2:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 1;
            num2 = new JTextField(10);
            frame.add(num2, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            result = new JLabel("Result: ");
            frame.add(result, gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 1;
            addButton = new JButton("Add");
            frame.add(addButton, gbc);

            gbc.gridx = 1;
            gbc.gridy = 3;
            subtractButton = new JButton("Subtract");
            frame.add(subtractButton, gbc);

            addButton.addActionListener(this);
            subtractButton.addActionListener(this);

            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
     }

     public void actionPerformed(ActionEvent e) {

          int number1 = Integer.parseInt(num1.getText());
          int number2 = Integer.parseInt(num2.getText());
          if (e.getSource() == addButton) {
               result.setText("Result: " + (number1 + number2));
          } else if (e.getSource() == subtractButton) {
               result.setText("Result: " + (number1 - number2));
          }
     }

     public static void main(String[] args) {
          new prog2();
     }
}