package ru.gb.girenko;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
    private Double leftOperand;
    private String operation;


    public Calculator(){
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);

        display.setFont(new Font("Arial",Font.BOLD,18));
        add(display, BorderLayout.NORTH);


        ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();
                if(".".equals(text)&& display.getText().contains(".")){
                    return;
                }
                if("0".equals(displayText)&&!".".equals(text)){
                   displayText="";
                }
                displayText += text;
                display.setText(displayText);
                if ("+/-".equals(text)){
                    displayText= "-";
                }
            }
        };

        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                Double rightOperand =Double.parseDouble(display.getText());

                if("=".equals(action)){
                    if(leftOperand != null){
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;

                        }
                        leftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                operation=action;
                display.setText("0");
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4, 4, 10, 10);
        numberPanel.setLayout(numberLayout);


        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
            button.setBackground(Color.CYAN);
        }

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);

        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(numberListener);
        zeroButton.setBackground(Color.CYAN);

        JButton negativeButton = new JButton("+/-");
        negativeButton.setBackground(Color.magenta);
        pointButton.setBackground(Color.magenta);
        numberPanel.add(pointButton);
        numberPanel.add(zeroButton);
        numberPanel.add(negativeButton);

        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(2, 3, 10, 10);
        buttonPanel.setLayout(buttonLayout);

        for(char c: "+-/*=C".toCharArray()){
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            button.setBackground(Color.magenta);
            buttonPanel.add(button);
        }

        add(numberPanel, BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        setVisible(true);


    }

    public static void main(String[] args) {new Calculator();}
}
