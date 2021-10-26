package exercise.cycles;

import java.util.Calendar;
import java.util.Date;

public class DateTimeExampe {
    public static void main(String[] args){
        //старый вариант
        Date date = new Date();
        System.out.println(date.toString());

        //новый вариант
        Calendar dateC = Calendar.getInstance();
        System.out.println(dateC.getTime());
    }
}
