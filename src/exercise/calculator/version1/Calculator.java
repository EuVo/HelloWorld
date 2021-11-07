package exercise.calculator.version1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel mainPanel;
    private JTextField inputField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button13;
    private JButton button14;
    private JButton answer;
    private JButton division;
    private JButton multiplaction;
    private JButton substraction;
    private JButton addition;
    int a;
    int b;
    int result;
    String operator;

    public Calculator(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        Maths maths = new Maths();

        getAddition();
        getSubtraction();
        getDivision();
        getMultiplaction();
        getAnswer(maths);
    }

    public void getAddition(){
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = (int) Double.parseDouble(inputField.getText());
                operator = "addition";
            }
        });
    }

    public void getSubtraction(){
        substraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = (int) Double.parseDouble(inputField.getText());
                operator = "subtraction";
            }
        });
    }

    public void getDivision(){
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = (int) Double.parseDouble(inputField.getText());
                operator = "division";
            }
        });
    }

    public void getMultiplaction(){
        multiplaction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = (int) Double.parseDouble(inputField.getText());
                operator = "multiplication";
            }
        });
    }

    public void getAnswer(Maths maths){
        answer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = (int) Double.parseDouble(inputField.getText());
                switch(operator){
                    case "addition":
                        result = maths.addition(a, b);
                        break;
                    case "subtraction":
                        result = maths.subtraction(a, b);
                        break;
                    case "division":
                        result = maths.division(a, b);
                        break;
                    case "multiplication":
                        result = maths.multiplication(a, b);
                        break;
                }

                inputField.setText(String.valueOf(result));
            }
        });
    }

    public static void main(String[] args){
        JFrame jFrame = new Calculator("Калькулятор");
        jFrame.setVisible(true);
    }
}
