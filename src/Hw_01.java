
import java.util.Scanner;
public class Hw_01 {
    public static void main(String[] args) throws java.io.IOException {
        hw_4();
    }

    // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    static int hw_1(int a){
        int res=0;
        for (int i=0; i<=a; i++){
            res+=i;
        }
        return res;
    }

    // 2. Вычислить n! (произведение чисел от 1 до n)
    static int hw_2(int a){
        int res=1;
        for (int i=1; i<=a; i++){
            res*=i;
        }
        return res;
    }

    // 3. Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1
    // и на себя без остатка)
    static void hw_3(int a){
        for (int j = 2; j <= a; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }

    // 4. Реализовать простой калькулятор 
    //(введите первое число, введите второе число, введите требуемую операцию, ответ)
    static void hw_4(){
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите дейстиве (+/-/*//): ");
        char action = scanner.next ().charAt (0);
        scanner.close();
        switch(action){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            
        }
    }

}
