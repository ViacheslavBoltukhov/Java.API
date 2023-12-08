package scr.Seminar5.Task1;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> passports = new HashMap<>();

    public void addPassports(String id, String name) {
        passports.put(id, name);
    }

    public String searchId(String name){
        StringBuilder names = new StringBuilder();
        for (String key : passports.keySet()) {
            if (passports.get(key).equals(name)){
                names.append(key);
                names.append(" ");

            }
        }
        return names.toString().trim();
    }
}
