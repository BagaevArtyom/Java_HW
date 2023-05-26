import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
/*Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов. */
public class Hw_5_1 {
    public static void main(String[] args) throws java.io.IOException {
        res();
        
    }
    static Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
    
     List<Integer> getList(){
    List<Integer> list1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во номеров: ");
        int num1 = scanner.nextInt();
        for (int i = 0; i < num1; i++) {
        int k = scanner.nextInt();
        list1.add(k);
        }
        
        return list1;
    }
     String getName(){
        Scanner scanner1=new Scanner(System.in);
        String name = scanner1.nextLine();
        return name;
              
    }
    
     Map<String, List<Integer>> add( String name, List<Integer> list1){
        map.put(name, list1);
        return map;
    }

    List<Integer> findContact(String name){
        return map.get(name);
    }

    static void res(){
        add(getName(), getList()); 
        
        System.out.println(map.toString());
    }

    
}
