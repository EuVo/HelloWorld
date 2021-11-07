package exercise.oop.principles.incapsulation;

public class IncapsulationWithPrivateValue {

    private int value = 10;

    //Функция для получения приватного значения текущего класса
    public int getIntValue(){

        return value;
    }

    //Функция для возможности переопределения приватного значения текущего класса
    public void setIntValue(int privateValue){
        value = privateValue;
    }
}
