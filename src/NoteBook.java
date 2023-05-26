

public class NoteBook {
    /*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
  соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
 можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. */

    private Integer ozu;
    private Integer hd;
    private String os;
    private String color;

    public NoteBook(String os, String color, Integer ozu, Integer hd){
        this.os = os;
        this.color = color;
        this.ozu = ozu;
        this.hd = hd;
    }

    public String getColor() {
        return color;
    }
    public Integer getHD() {
        return hd;
    }
    public String getOS() {
        return os;
    }
    public Integer getOZU() {
        return ozu;
    }
    public String toString(){
        return "ОЗУ: " + ozu + ", Жесткий диск: " + hd + ", Операционная система: " + os + ", Цвет: " + color;
    }

}
