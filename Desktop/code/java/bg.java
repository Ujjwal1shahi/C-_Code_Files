import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorChanger implements ActionListener {

    JFrame jf;
    JTextField red;
    JTextField blue;
    JTextField green;
    JPanel colorPanel;
    JButton showOutputButton;

    ColorChanger() {
        // Create JFrame
        jf = new JFrame("Color Change");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        // Add labels and text fields for RGB input
        JLabel redLabel = new JLabel("RED:");
        jf.add(redLabel);
        red = new JTextField(15);
        jf.add(red);

        JLabel blueLabel = new JLabel("BLUE:");
        jf.add(blueLabel);
        blue = new JTextField(15);
        jf.add(blue);

        JLabel greenLabel = new JLabel("GREEN:");
        jf.add(greenLabel);
        green = new JTextField(15);
        jf.add(green);

        // Add button to show output
        showOutputButton = new JButton("Show Output");
        jf.add(showOutputButton);
        showOutputButton.addActionListener(this);

        // Add panel to display color
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 300));
        colorPanel.setBackground(Color.WHITE); // Default panel color
        jf.add(colorPanel);

        // Make JFrame visible
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            // Get RGB values from text fields
            int r = Integer.parseInt(red.getText());
            int g = Integer.parseInt(green.getText());
            int b = Integer.parseInt(blue.getText());

            // Validate RGB values (should be between 0 and 255)
            if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
                JOptionPane.showMessageDialog(
                    jf,
                    "Please enter values between 0 and 255."
                );
                return;
            }

            // Change panel background color
            Color selectedColor = new Color(r, g, b); // Use java.awt.Color
            colorPanel.setBackground(selectedColor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                jf,
                "Please enter valid numeric values."
            );
        }
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
