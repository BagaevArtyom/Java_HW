import java.util.ArrayList;

import java.util.Collections;


public class Hw_03 {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 8, 3, 11, 12, 15};
        
        delet2(a);

        findMinMax(a);
        

    }

    /*Пусть дан произвольный список целых чисел, удалить из него четные числа */

    static void delet2(int[] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2!=0){
                list.add(a[i]);
                }
        }
        System.out.println(list);
    }

    /*Задан целочисленный список ArrayList. Найти минимальное, максимальное
     и среднее арифметическое из этого списка. Collections.max()  */
     static void findMinMax(int[] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
                list.add(a[i]);
            }
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
     }

     
}
