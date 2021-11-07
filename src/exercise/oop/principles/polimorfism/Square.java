package exercise.oop.principles.polimorfism;

public class Square extends Shape{

    //Унаследовав суперкласс, переопределяем его метод
    public void draw(){
        System.out.println("Квадрат");
    }
}
