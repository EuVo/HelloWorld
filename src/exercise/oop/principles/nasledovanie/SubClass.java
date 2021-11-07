package exercise.oop.principles.nasledovanie;

public class SubClass extends SuperClass{

    public static void main(String[] args){
        int a = 10, b = 20;

        SubClass subclass = new SubClass();

        //Использование функции addition из суперкласса
        subclass.addition(a, b);
        subclass.subtraction(a, b);
    }

    //Использование переменной "c" из суперкласса
    public void subtraction(int a, int b) {
        c = a - b;
        System.out.println("Разность чисел: " + c);
    }
}
