package exercise.calculator.version2;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame{
    private JTextField numberValue  = new JTextField(20);
    private JButton additionButton = new JButton("+");
    private JButton substractionButton = new JButton("-");
    private JButton multiplicationButton = new JButton("*");
    private JButton divisionButton = new JButton("/");
    private JButton calculateButton = new JButton("=");

    CalculatorGUI(String title){
        super(title);

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 100);

        calcPanel.add(numberValue);
        calcPanel.add(additionButton);
        calcPanel.add(substractionButton);
        calcPanel.add(multiplicationButton);
        calcPanel.add(divisionButton);
        calcPanel.add(calculateButton);

        this.add(calcPanel);
    }

    public int getFirstNumber(){

        return Integer.parseInt(numberValue.getText());
    }

    public int getSecondNumber(){

        return Integer.parseInt(numberValue.getText());
    }

    public void setCalcSolution(int solution){

        numberValue.setText(Integer.toString(solution));
    }

    void addListener(ActionListener listenForOperButton){

        additionButton.addActionListener(listenForOperButton);
    }

    void subListener(ActionListener listenForOperButton){

        substractionButton.addActionListener(listenForOperButton);
    }

    void multListener(ActionListener listenForOperButton){

        multiplicationButton.addActionListener(listenForOperButton);
    }

    void divListener(ActionListener listenForOperButton){

        divisionButton.addActionListener(listenForOperButton);
    }

    void calculateListener(ActionListener listenForCalcButton){

        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
