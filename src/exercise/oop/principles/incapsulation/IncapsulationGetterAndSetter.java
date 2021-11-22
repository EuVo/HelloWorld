package exercise.oop.principles.incapsulation;

public class IncapsulationGetterAndSetter {

    public static void main(String[] args){

        //Создание объекта(экземпляра класса) на основе класса IncapsulationWithPrivateValue для обращения к его методам(функциям)
        IncapsulationWithPrivateValue incapsMeth = new IncapsulationWithPrivateValue();

        //1. Получение значения приватного параметра value при помощи функции getIntValue()
        System.out.println(incapsMeth.getIntValue());

        //2. Переопределение значения приватного параметра value при помощи функции setIntValue()
        incapsMeth.setIntValue(22);
        System.out.println(incapsMeth.getIntValue());
    }
}
