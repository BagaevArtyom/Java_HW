import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main_java {


    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws java.io.IOException {
        NoteBook noteBook1 = new NoteBook("Win", "black", 32, 512);
        NoteBook noteBook2 = new NoteBook("Mac", "grey", 8, 256);
        NoteBook noteBook3 = new NoteBook("Win", "blue", 4, 64);
        NoteBook noteBook4 = new NoteBook("Mac", "white", 16, 256);
        NoteBook noteBook5 = new NoteBook("Win", "black", 32, 512);
        NoteBook noteBook6 = new NoteBook("Mac", "black", 8, 256);

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(noteBook1);
        notebooks.add(noteBook2);
        notebooks.add(noteBook3);
        notebooks.add(noteBook4);
        notebooks.add(noteBook5);
        notebooks.add(noteBook6);
        //for (NoteBook noteBook: notebooks){
          //  System.out.println(noteBook);

        Map<String, Integer> param = enterParam();
        for (NoteBook notebook: notebooks){
            if (notebook.getHD().equals(param.get("hd")) && notebook.getOZU().equals(param.get("ozu"))){
                System.out.println(notebook.toString());
            }
        }
    
    }

    /**
     * @return
     */
    static Map<String, Integer> enterParam(){
    Map<String, Integer> map = new HashMap<String, Integer>();
    System.out.println("Введите параметры: ");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Жесткий диск: ");
    Integer inHd = scanner.nextInt();
    map.put("hd", inHd);
    System.out.println("ОЗУ: ");
    Integer inOzu = scanner.nextInt();
    map.put("ozu", inOzu);
    //System.out.println(map.toString());
    scanner.close();
    return map;

    
    }
}
