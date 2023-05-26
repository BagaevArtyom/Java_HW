import java.util.LinkedList;
import java.util.Scanner;

public class Hw_04_1 {
    public static void main(String[] args) throws java.io.IOException {
        res();
}
    /*Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - 
    помещает элемент в конец очереди, dequeue() - возвращает
     первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.*/

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

    boolean work =true;
    while (work){
        System.out.println("Введите дуйствие(enqueue/dequeue/first): ");
        String line = scanner.nextLine();
        switch (line){
            case "enqueue":
                System.out.println("Введите число для добавления: ");
                int g = scanner.nextInt();
                list1.add(0, g);
                System.out.println("Число добавлено. " +list1);
                break;
            case "dequeue":
                System.out.println(list1.getFirst());
                list1.removeFirst();
                System.out.println("Лист: " +list1);
                break;
            case "first":
                System.out.println("Первый элемент: " +list1.getFirst());
                System.out.println("Лист: " +list1);
                break;
            case "break":
                work=false;

        }
    
    }
    scanner.close();
    }
}
