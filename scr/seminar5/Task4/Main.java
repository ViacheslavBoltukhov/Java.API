package scr.seminar5.Task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;

/*
Взять набор строк, например,

Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.

Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        System.out.println(lenLetters(text));
    }

    public static TreeMap<Integer, LinkedList<String>> lenLetters(String text) {
        text = text.replace("\n", " ").replace(".", "");
        String[] arrWords = text.split(" ");
        System.out.println(Arrays.toString(arrWords));
        TreeMap<Integer, LinkedList<String>> lenLetters = new TreeMap<>(Comparator.reverseOrder());
        for (String word : arrWords) {
            Integer lenWord = word.length();
            if (lenLetters.containsKey(lenWord)){
                lenLetters.get(lenWord).add(word);
            }
            else {
                LinkedList<String> words = new LinkedList<>();
                words.add(word);
                lenLetters.put(lenWord,words);
            }
        }
        return lenLetters;
    }
}
