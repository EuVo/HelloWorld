package exercise.calculator.version2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private CalculatorGUI theView;
    private CalculatorModel theModel;
    static int firstNumber, secondNumber = 0;
    String operation;

    public CalculatorController(CalculatorGUI theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListener(new AddListener());
        this.theView.subListener(new SubListener());
        this.theView.multListener(new MultListener());
        this.theView.divListener(new DivListener());
        this.theView.calculateListener(new CalculateListener());
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try{
                firstNumber = theView.getFirstNumber();
                operation = "add";
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter first value");
            }
        }
    }

    class SubListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try{
                firstNumber = theView.getFirstNumber();
                operation = "sub";
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter first value");
            }
        }
    }

    class MultListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try{
                firstNumber = theView.getFirstNumber();
                operation = "multi";
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter first value");
            }
        }
    }

    class DivListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try{
                firstNumber = theView.getFirstNumber();
                operation = "div";
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter first value");
            }
        }
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try{
                secondNumber = theView.getSecondNumber();
                switch (operation){
                    case "add":
                        theModel.addTwoNumbers(firstNumber, secondNumber);
                        theView.setCalcSolution(theModel.getCalculationaddValue());
                        break;
                    case "sub":
                        theModel.subTwoNumbers(firstNumber, secondNumber);
                        theView.setCalcSolution(theModel.getCalculationsubValue());
                        break;
                    case "multi":
                        theModel.multiTwoNumbers(firstNumber, secondNumber);
                        theView.setCalcSolution(theModel.getCalculationmultiValue());
                        break;
                    case "div":
                        theModel.divTwoNumbers(firstNumber, secondNumber);
                        theView.setCalcSolution(theModel.getCalculationdivValue());
                        break;
                }
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter second value");
            }
        }
    }
}
