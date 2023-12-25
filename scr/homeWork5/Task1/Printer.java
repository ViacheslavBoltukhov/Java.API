package scr.homeWork5.Task1;

import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }
        else {
            ArrayList<Integer> numbs = new ArrayList<>();
            numbs.add(phoneNum);
            phoneBook.put(name,numbs);
        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> n = new ArrayList<>();
        return phoneBook.getOrDefault(name, n);

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
}
// Не удаляйте этот класс - он нужен для

public class Printer {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}