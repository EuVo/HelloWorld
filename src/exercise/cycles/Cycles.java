package exercise.cycles;

public class Cycles {

    public static void main(String[] args){
        int[] values = {1, 2, 3, 6, 4};
        //checkFor(values);
        //checkWhile(values);
        checkDowhile(values);
    }

    public static void checkFor(int[] array){
        for(int value : array){
            System.out.print(value);
        }
    }

    public static void checkWhile(int[] array){
        int x = 0;
        while(array[x] < 3){
            System.out.println(array[x] + " меньше 3х");
            x++;
        }
    }

    public static void checkDowhile(int[] array){
        int x = 0;
        do{
            System.out.println(array[x] + " меньше 3х");
            x++;
        }while(array[x] < 3);
    }
}
