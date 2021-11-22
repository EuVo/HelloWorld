package exercise.oop.principles.polimorfism;

public class Circle extends Shape{

    //Унаследовав суперкласс, переопределяем его метод
    public void draw(){
        System.out.println("Круг");
    }
}
