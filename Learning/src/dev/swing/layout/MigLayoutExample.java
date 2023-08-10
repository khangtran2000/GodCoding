package dev.swing.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MigLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MigLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new MigLayout("wrap 2", "[][grow]")); // Columns: 2, Constraints: 1 label, grow label

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nEmail: " + email);
            }
        });

        panel.add(nameLabel);
        panel.add(nameField, "growx");

        panel.add(emailLabel);
        panel.add(emailField, "growx");

        panel.add(submitButton, "span 2, center");

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
