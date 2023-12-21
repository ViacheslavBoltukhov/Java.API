package scr.homeWork9;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("group1");
        StudentGroup group2 = new StudentGroup("group2");
        StudentGroup group3 = new StudentGroup("group3");
        StudentGroup group4 = new StudentGroup("group4");
        StudentGroup group5 = new StudentGroup("group5");
        StudentGroup group6 = new StudentGroup("group6");
        Potok potok1 = new Potok();
        potok1.addGroup(group1);
        potok1.addGroup(group5);
        potok1.addGroup(group6);
        Potok potok2 = new Potok();
        potok2.addGroup(group2);
        potok2.addGroup(group3);
        potok2.addGroup(group4);
        PotokService potokService = new PotokService();
        Controller controller = new Controller(potokService);
        List<Potok> potokList = new ArrayList<Potok>();
        potokList.add(potok1);
        potokList.add(potok2);
        Controller.SortPotok(potokList);
        for (Potok potok : potokList) {
            System.out.println("Potok:");
            for (StudentGroup group : potok) {
                System.out.println("- " + group.getName());
            }
        }
    }
}
