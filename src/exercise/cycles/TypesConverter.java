package exercise.cycles;

public class TypesConverter {

    public static void main(String[] args){

        //приведение целочисленного типа данных к строковому
        int x = 4;
        String s = String.valueOf(x);

        //приведение строковому типа данных к целочисленного
        String a = "5";
        int b = Integer.valueOf(a);

        if(b == 5){
            System.out.println("b теперь имеет целочисленный тип данных");
        }else{
            System.out.println("Ошибка");
        }
    }
}
