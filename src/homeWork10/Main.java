package src.homeWork10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ivan", "Ivanov", "Ivanovich");
        Teacher teacher2 = new Teacher(2, "Petrov", "Petr", "Petrovich");
        List<Teacher> teacher= new ArrayList<>();
        teacher.add(teacher1);
        teacher.add(teacher2);
        System.out.println(teacher);
        System.out.println(teacher1.getTeacherId());
    }
}
