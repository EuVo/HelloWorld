package exercise.calculator.version2;

public class CalculatorModel {

    private int calculationaddValue,calculationsubValue, calculationmultiValue, calculationdivValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationaddValue = firstNumber + secondNumber;
    }

    public void subTwoNumbers(int firstNumber, int secondNumber){
        calculationsubValue = firstNumber - secondNumber;
    }

    public void multiTwoNumbers(int firstNumber, int secondNumber){
        calculationmultiValue = firstNumber * secondNumber;
    }

    public void divTwoNumbers(int firstNumber, int secondNumber){
        calculationdivValue = firstNumber / secondNumber;
    }

    public int getCalculationaddValue(){

        return calculationaddValue;
    }

    public int getCalculationsubValue(){

        return calculationsubValue;
    }

    public int getCalculationmultiValue(){

        return calculationmultiValue;
    }

    public int getCalculationdivValue(){

        return calculationdivValue;
    }
}

