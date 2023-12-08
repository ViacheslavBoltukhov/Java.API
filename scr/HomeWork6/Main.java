package scr.HomeWork6;

import scr.Seminar6.Task2.Cat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<NoteBook> noteBooks = new HashSet<>();
        noteBooks = generationRandom(20);
        printSet(noteBooks);
    }
    static Set<NoteBook> generationRandom(int count){
        Set<NoteBook> noteBooks = new HashSet<>();
        Map<Integer, String> typeOS = new HashMap<>();
        typeOS.put(1, "Windows");
        typeOS.put(2, "Linux");
        typeOS.put(3, "MacOS");
        typeOS.put(4, "MS-DOS");
        Map<Integer, String> colourBook = new HashMap<>();
        colourBook.put(1, "red");
        colourBook.put(2, "black");
        colourBook.put(3, "white");
        colourBook.put(4, "gray");
        colourBook.put(5, "green");
        for (int i = 0; i < count; i++) {
            NoteBook newNoteBook = new NoteBook();
            Random random = new Random();
            newNoteBook.setRAM(random.nextInt(1, 33));
            newNoteBook.setHDD(random.nextInt(1, 9));
            newNoteBook.setOS(typeOS.get(random.nextInt(1, 5)));
            newNoteBook.setColour(colourBook.get(random.nextInt(1,6)));
            noteBooks.add(newNoteBook);
        }

        return noteBooks;
    }
    static void printSet(Set<NoteBook> noteBooks){
        for (NoteBook noteBook: noteBooks){
            System.out.println(noteBook);
        }
    }
}
