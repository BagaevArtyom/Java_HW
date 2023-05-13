import java.util.ArrayList;
import java.util.List;


public class Hw_03_3 {
    public static void main(String[] args){
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Сатурн", "Юритер", "Уран", "Нептун", "Плутон"};
        planetList(planets, 20);
    }
    /*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке. */

    /**
     * @param planets
     * @param size
     */
    static void planetList(String[] planets, int size){
        List list = new ArrayList();
        for (int i = 0; i <= size; i++) {
        int rn = (int) (Math.random()*9);
        list.add(planets[rn]);
        }
        System.out.println(list);
        
        
        int k=1;
        for (int j=0; j<size; j++){
            for (int g=1; g<size; g++){
                if (list.get(j)==list.get(g)){
                    k++;
                    list.remove(g);
                    size--;
                }
            }
            System.out.println("Планета "+list.get(j) + " встречается " + k +" раз");
            k=1;
        }    
        

            
        
    
                    
    }
}
