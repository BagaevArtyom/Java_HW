import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
        NoteBook noteBook2 = new NoteBook("Mac", "grey", 2, 256);
        NoteBook noteBook3 = new NoteBook("Win", "blue", 4, 64);
        NoteBook noteBook4 = new NoteBook("Mac", "white", 16, 256);
        NoteBook noteBook5 = new NoteBook("Win", "black", 32, 512);
        NoteBook noteBook6 = new NoteBook("Mac", "black", 8, 64);

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(noteBook1);
        notebooks.add(noteBook2);
        notebooks.add(noteBook3);
        notebooks.add(noteBook4);
        notebooks.add(noteBook5);
        notebooks.add(noteBook6);
        for (NoteBook noteBook: notebooks){
            System.out.println(noteBook);
        }
    Map<String, String> map = new HashMap<String, String>();
    System.out.println("Введите параметры. Операционная система(Mac|Win): ");
    Scanner scanner = new Scanner(System.in);
    String inOs = scanner.nextLine();
    map.put("os", inOs);
    
    }

}
