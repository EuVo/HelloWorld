package exercise.oop.principles.polimorfism;

public class RunningClass {

    public static void main(String[] args){

        //Создаем массив объектов, чтобы не обращаться к каждому из объектов по отдельности
        Shape[] array = new Shape[] {new Circle(), new Square()};

        //Выводим результат работы функции каждого класса
        for(Shape i : array){
            i.draw();
        }
    }
}
