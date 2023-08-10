package dev.swing.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    
    public CardLayoutExample() {
        frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        
        JButton button1 = new JButton("Show Panel 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "panel1");
            }
        });
        
        JButton button2 = new JButton("Show Panel 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "panel2");
            }
        });
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Panel 1"));
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.add(new JLabel("Panel 2"));
        
        cardPanel.add(panel1, "panel1");
        cardPanel.add(panel2, "panel2");
        
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutExample();
            }
        });
    }
}
