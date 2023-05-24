package labexam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab_9_gui {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        JPanel panel = new JPanel();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(help);

        JMenuItem open = new JMenuItem("Open");
        JMenuItem saveAs = new JMenuItem("Save as");

        file.add(open);
        file.add(saveAs);

        JTextArea textArea = new JTextArea();

        JTextField text = new JTextField(15);
        JButton reset = new JButton("Clear");
        JButton send = new JButton("Send");
        JLabel label = new JLabel("Please Enter Text");
        panel.add(label);
        panel.add(text);
        panel.add(send);
        panel.add(reset);

        // Action listener for the send button
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = text.getText();
                textArea.append(inputText + "\n");
                text.setText("");
            }
        });

        // Action listener for the clear button
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        jf.getContentPane().add(menuBar, BorderLayout.NORTH);
        jf.getContentPane().add(panel, BorderLayout.SOUTH);
        jf.getContentPane().add(textArea, BorderLayout.CENTER);

        jf.setVisible(true);

    }
}
