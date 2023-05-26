import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;



public class Hw_04_2 {
    public static void main(String[] args) throws java.io.IOException {
        res();
}
    /*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */
    static void res(){
        LinkedList<Integer> list1 = new LinkedList<>();
        System.out.println("Введите кол-во: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        for (int i = 0; i < num1; i++) {
        int k = scanner.nextInt();
        list1.add(k);
        }
        System.out.println("Исходный лист" +list1);

        Iterator<Integer> iterator = list1.iterator();
        int sum = 0;
        while (iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println(sum);
        scanner.close();
    }
}
