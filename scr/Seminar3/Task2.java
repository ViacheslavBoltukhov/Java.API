/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
package scr.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Object> lst = new ArrayList<>();
        lst.add("Марс");
        lst.add(1);
        lst.add(1.2);
        lst.add(-1);
        lst.add(null);
        lst.add("Венера");
        lst.add(0);

//        for (int i = 0; i < lst.size(); i++) {
//            if (lst.get(i) instanceof Integer){
//                lst.remove(i);
//                i--;
//            }
//
//        }


//        lst.removeIf(object -> object instanceof Integer);
        Iterator<Object> iterator = lst.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (object instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(lst);
    }

}
