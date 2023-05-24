package labexam;

import javax.swing.*;
import java.awt.event.*;

public class addCalculator {
    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField resultField;

    public addCalculator() {
        JFrame frame = new JFrame("Number Addition Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel headingLabel = new JLabel("Number Addition");
        headingLabel.setBounds(10, 10, 120, 20);
        frame.add(headingLabel);

        JLabel firstNumberLabel = new JLabel("First Number:",JLabel.RIGHT);
        firstNumberLabel.setBounds(10, 40, 120, 20);
        frame.add(firstNumberLabel);

        firstNumberField = new JTextField();
        firstNumberField.setBounds(130, 40, 80, 20);
        frame.add(firstNumberField);

        JLabel secondNumberLabel = new JLabel("Second Number:",JLabel.RIGHT);
        secondNumberLabel.setBounds(10, 70, 120, 20);
        frame.add(secondNumberLabel);

        secondNumberField = new JTextField();
        secondNumberField.setBounds(130, 70, 80, 20);
        frame.add(secondNumberField);

        JLabel resultLabel = new JLabel("Result:",JLabel.RIGHT);
        resultLabel.setBounds(10, 100, 120, 20);
        frame.add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(130, 100, 80, 20);
        resultField.setEditable(false);
        frame.add(resultField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 130, 80, 20);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int firstNumber = Integer.parseInt(firstNumberField.getText());
                int secondNumber = Integer.parseInt(secondNumberField.getText());
                int result = firstNumber + secondNumber;
                resultField.setText(Integer.toString(result));
            }
        });
        frame.add(addButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(100, 130, 80, 20);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
            }
        });
        frame.add(clearButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(210, 140, 80, 20);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(exitButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new addCalculator();
    }
}
