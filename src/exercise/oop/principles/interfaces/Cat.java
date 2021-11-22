package exercise.oop.principles.interfaces;

public class Cat implements Animal{

    public static void main(String[] args){
        Animal m = new Cat();
        m.eat();
        m.travel();
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает");
    }

    @Override
    public void travel() {
        System.out.println("Кошка путешествует");
    }
}
