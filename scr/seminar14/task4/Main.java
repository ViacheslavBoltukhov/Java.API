package scr.seminar14.task4;
/*
Задание №4
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
        1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить
*/

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, null, 3, 4, null};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder error = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                error.append(i).append(" ");
            }
        }
        if (error.length() > 0) {
            throw new RuntimeException("Error: " + error.toString());
        }
    }
}
