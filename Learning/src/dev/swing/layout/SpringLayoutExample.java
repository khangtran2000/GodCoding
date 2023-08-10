package dev.swing.layout;

import javax.swing.*;
import javax.swing.SpringLayout;

import javax.swing.*;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpringLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new SpringLayout());

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 1 clicked!");
            }
        });

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button 2 clicked!");
            }
        });

        panel.add(button1);
        panel.add(button2);

        SpringLayout layout = (SpringLayout) panel.getLayout();

        // Define constraints for buttons...

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

