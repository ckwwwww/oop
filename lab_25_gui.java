package labexam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab_25_gui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel buttonPanel2 = new JPanel(new FlowLayout());

        // Create buttons with different text colors
        JButton button1 = createButton("All the best", Color.RED);
        JButton button2 = createButton("All the best", Color.GREEN);
        JButton button3 = createButton("All the best", Color.BLUE);
        JButton button4 = createButton("All the best", Color.ORANGE);
        JButton bottomButton = createButton("All the best", Color.BLACK);
        bottomButton.setBounds(100, 60, 30, 10);

        // Add buttons to the button panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel2.add(bottomButton);

        // Create panel for labels
        JPanel labelPanel = new JPanel(new GridLayout(5, 1));

        // Create labels with initial colors
        JLabel label1 = createLabel("All the best", Color.BLACK);
        JLabel label2 = createLabel("All the best", Color.BLACK);
        JLabel label3 = createLabel("All the best", Color.BLACK);
        JLabel label4 = createLabel("All the best", Color.BLACK);

        // Add labels to the label panel
        labelPanel.add(label1);
        labelPanel.add(label2);
        labelPanel.add(label3);
        labelPanel.add(label4);

        // Add action listener to buttons
        ActionListener buttonClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                Color textColor = button.getForeground();

                // Change label colors to match button text color
                label1.setForeground(textColor);
                label2.setForeground(textColor);
                label3.setForeground(textColor);
                label4.setForeground(textColor);
            }
        };

        // Register the same action listener for all buttons
        button1.addActionListener(buttonClickListener);
        button2.addActionListener(buttonClickListener);
        button3.addActionListener(buttonClickListener);
        button4.addActionListener(buttonClickListener);
        bottomButton.addActionListener(buttonClickListener);

        // Add components to the frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(bottomButton );
        frame.add(labelPanel, BorderLayout.CENTER);

        // Set frame visible
        frame.setVisible(true);
    }

    private static JButton createButton(String text, Color textColor) {
        JButton button = new JButton(text);
        button.setForeground(textColor);
        button.setBackground(Color.WHITE);
        return button;
    }

    private static JLabel createLabel(String text, Color textColor) {
        JLabel label = new JLabel(text);
        label.setForeground(textColor);
        return label;
    }
}
