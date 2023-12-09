package scr.HomeWork6;

import scr.Seminar6.Task2.Cat;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set<NoteBook> allNoteBooks = new HashSet<>();
        allNoteBooks = generationRandom(50);
        printSet(allNoteBooks);
        Set<NoteBook> noteBooks = Set.copyOf(allNoteBooks);
        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию фильтрации: \n1) ОЗУ\n2) Объем ЖД\n3)Операционная система\n4) Цвет\n5) Завершить фильтрацию ");
            Scanner scanner = new Scanner(System.in);
            String pr = scanner.nextLine();
            Set<NoteBook> filterBook = new HashSet<>();
            switch (pr) {
                case "1":
                    System.out.println("Фильтр по ОЗУ");
                    System.out.println("Введите минимальное значение желаемой памяти ОЗУ в Гигобайтах");
                    int minRam = scanner.nextInt();
                    System.out.println("Введите максимальное значение желаемой памяти ОЗУ Гигобайтах");
                    int maxRam = scanner.nextInt();
                    for (NoteBook noteBook: noteBooks){
                        if (noteBook.getRAM() >= minRam && noteBook.getRAM() <= maxRam){
                            filterBook.add(noteBook);
                        }
                    }
                    noteBooks = Set.copyOf(filterBook);
                    break;
                case "2":
                    System.out.println("Фильтр по ЖД");
                    System.out.println("Введите минимальное значение желаемой памяти ЖД в Теробайтах");
                    int minHdd = scanner.nextInt();
                    System.out.println("Введите максимальное значение желаемой памяти ЖД Теробайтах");
                    int maxHdd = scanner.nextInt();
                    for (NoteBook noteBook: noteBooks){
                        if (noteBook.getHDD() >= minHdd && noteBook.getHDD() <= maxHdd){
                            filterBook.add(noteBook);
                        }
                    }
                    noteBooks = Set.copyOf(filterBook);
                    break;
                case "3":
                    System.out.println("Фильтр ОС");
                    System.out.println("Выберите Ос:\n1 - Windows\n2 - Linux\n3 - MacOS\n4 - MS-DOS");
                    String os = scanner.nextLine();
                    switch (os) {
                        case "1":
                            for (NoteBook noteBook: noteBooks){
                                if (noteBook.getOS().equals("Windows")){
                                    filterBook.add(noteBook);
                                }
                            }
                            break;
                        case "2":
                            for (NoteBook noteBook: noteBooks){
                                if (noteBook.getOS().equals("Linux")){
                                    filterBook.add(noteBook);
                                }
                            }
                            break;
                        case "3":
                            for (NoteBook noteBook: noteBooks){
                                if (noteBook.getOS().equals("MacOS")){
                                    filterBook.add(noteBook);
                                }
                            }
                            break;
                        case "4":
                            for (NoteBook noteBook: noteBooks){
                                if (noteBook.getOS().equals("MS-DOS")){
                                }
                            }
                            break;
                        default:
                            System.out.println("Некорректный ввод");
                            break;
                    }
                    noteBooks = Set.copyOf(filterBook);
                    break;
                        case "4":
                            System.out.println("Фильтр цвету");
                            System.out.println("Выберите цвет:\n1 - red\n2 - black\n3 - white\n4 - gray\n5 - green");
                            String col = scanner.nextLine();
                            switch (col) {
                                case "1":
                                    for (NoteBook noteBook: noteBooks){
                                        if (noteBook.getColour().equals("red")){
                                            filterBook.add(noteBook);
                                        }
                                    }
                                    break;
                                case "2":
                                    for (NoteBook noteBook: noteBooks){
                                        if (noteBook.getColour().equals("black")){
                                            filterBook.add(noteBook);
                                        }
                                    }
                                    break;
                                case "3":
                                    for (NoteBook noteBook: noteBooks){
                                        if (noteBook.getColour().equals("white")){
                                            filterBook.add(noteBook);
                                        }
                                    }
                                    break;
                                case "4":
                                    for (NoteBook noteBook: noteBooks){
                                        if (noteBook.getColour().equals("gray")){
                                            filterBook.add(noteBook);
                                        }
                                    }
                                case "5":
                                    for (NoteBook noteBook: noteBooks){
                                        if (noteBook.getColour().equals("green")){
                                            filterBook.add(noteBook);
                                        }
                                    }
                                default:
                                    System.out.println("Некорректный ввод");
                                    break;
                            }
                            noteBooks = Set.copyOf(filterBook);
                            break;
                        case "5":
                            System.out.println("Подбор окончен");
                            if (noteBooks.isEmpty()) {
                                System.out.println("Нет ноутбуков подходящих по выбранные параметры\nОзнакомьтесь с полным списком имеющихся в наличии ноутбуков");
                                printSet(allNoteBooks);
                            }
                            else {
                                System.out.println("Подходящие ноутбуки");
                                printSet(noteBooks);
                            }
                            return;
                        default:
                            System.out.println("Некорректный ввод");
                            break;
                    }
            }
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
