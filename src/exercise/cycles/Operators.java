package exercise.cycles;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args){
        int[] values = {1, 2, 3, 6, 4};
        //checkIfelse(values);
        //checkIfelseif(values);
        //checkSwitchcase();
        checkTrycatch(values);
    }

    public static void checkIfelse(int[] array){
        int x = 5;

        if(array[4] > x){
            System.out.println(x + " меньше чем " + array[4]);
        }else{
            System.out.println(x + " больше чем " + array[4]);
        }
    }

    public static void checkIfelseif(int[] array){
        int x = 4;

        if(array[4] > x){
            System.out.println(x + " меньше чем " + array[4]);
        }else if(array[4] == x){
            System.out.println(x + " равно " + array[4]);
        }else{
            System.out.println(x + " больше чем " + array[4]);
        }
    }

    public static void checkSwitchcase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark value from S to D: ");
        String x = sc.nextLine();

        switch (x){
            case "S":
                System.out.println("Excellent");
                break; //показатель того, что мы останавливаемся только на этом case, в последующие case мы не сваливаемся
            case "A":
                System.out.println("Very good");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Bad");
                break;
            case "D":
                System.out.println("Very bad");
                break;
        }
    }

    public static void checkTrycatch(int[] array){
        try {
            System.out.println("Доступ к пятому элементу массива:" + array[5]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
        System.out.println("Индекс массива больше максимально возможного. Проверьте корректность указанного индекса");
    }
}
