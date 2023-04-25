import java.time.LocalTime;
import java.util.Scanner;

public class Java_1 {
    public static void main(String[] args) {
        test();
    }
    static void test(){
        /*Вывести приветсвие (добрый день/утро/вечер) */
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour>=5 && hour<12){
            System.out.println("Доброе утро, " + name + "!");
        }
        else if (hour>=12 && hour<18){
            System.out.println("Добрый день, " + name + "!");
        }
        else if (hour >= 18 && hour <23 ){
            System.out.println("Добрый вечер, " + name + "!");
        }
        else {
            System.out.println("Доброй ночи, " + name + "!");
        }
        scanner.close();
    }

    
}

