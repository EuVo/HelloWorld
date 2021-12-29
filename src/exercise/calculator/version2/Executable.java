package exercise.calculator.version2;

public class Executable {
    public static void main(String[] args){
        CalculatorGUI theView = new CalculatorGUI("Calculator");

        CalculatorModel theModel = new CalculatorModel();

        CalculatorController theController = new CalculatorController(theView,theModel);

        theView.setVisible(true);
    }
}
