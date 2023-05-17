import java.util.LinkedList;
import java.util.Scanner;
public class Hw_04 {
    public static void main(String[] args) throws java.io.IOException {
        hw1();
}
/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
который вернет “перевернутый” список. Постараться не обращаться к листу по индексам. */
/**
 * 
 */
static void hw1(){
    LinkedList<Integer> list1 = new LinkedList<>();
    System.out.println("Введите кол-во: ");
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    for (int i = 0; i < num1; i++) {
        int k = scanner.nextInt();
        list1.add(k);
    }
    scanner.close();
    System.out.println("Исходный лист" +list1);

    LinkedList<Integer> list2 = new LinkedList<>();
    int h = list1.size();
    while (h>0){
        list2.add(list1.getLast());
        list1.removeLast();
        h--;
    }
    System.out.println("Итоговый лист" +list2);      
}
@Override
public String toString() {
    return "Hw_04 []";
}
}
