import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleRGBPicker implements ActionListener {
    JFrame frame;
    JTextField redField, greenField, blueField;

    SimpleRGBPicker() {
       
        frame = new JFrame("RGB Color Picker");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        
        JLabel redLabel = new JLabel("Red:");
        redLabel.setBounds(20, 20, 50, 20);
        frame.add(redLabel);

        JLabel greenLabel = new JLabel("Green:");
        greenLabel.setBounds(120, 20, 50, 20);
        frame.add(greenLabel);

        JLabel blueLabel = new JLabel("Blue:");
        blueLabel.setBounds(220, 20, 50, 20);
        frame.add(blueLabel);

        
        redField = new JTextField("0");
        redField.setBounds(20, 50, 60, 25);
        frame.add(redField);

        greenField = new JTextField("0");
        greenField.setBounds(120, 50, 60, 25);
        frame.add(greenField);

        blueField = new JTextField("0");
        blueField.setBounds(220, 50, 60, 25);
        frame.add(blueField);

        
        JButton showButton = new JButton("Show");
        showButton.setBounds(120, 90, 80, 30);
        showButton.addActionListener(this);
        frame.add(showButton);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        try {
            int red = Integer.parseInt(redField.getText());
            int green = Integer.parseInt(greenField.getText());
            int blue = Integer.parseInt(blueField.getText());

            
            red = Math.max(0, Math.min(255, red));
            green = Math.max(0, Math.min(255, green));
            blue = Math.max(0, Math.min(255, blue));


            frame.getContentPane().setBackground(new Color(red, green, blue));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Enter valid numbers (0-255)!");
        }
    }

    public static void main(String[] args) {
        new SimpleRGBPicker();
    }
}
