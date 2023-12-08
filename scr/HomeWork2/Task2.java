package scr.HomeWork2;

import java.util.Arrays;


class Task2 {
    public static void main(String[] args) {
        int[] arr = {};
        arr = new int[]{9, 4, 8, 3, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    private static int[] bubbleSort(int[] mas) {
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length - i - 1; j++){
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;

                }
            }
        }
        return mas;
    }

}

/*
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
            try {
                    log = new File("log.txt");
                    log.createNewFile();
                    fileWriter = new FileWriter(log);
                    bubbleSort(mas);

            } catch (IOException e) {
                    e.printStackTrace();
            } finally {
                    try {
                            fileWriter.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
    }

    private static int[] bubbleSort(int[] mas) {
            for (int i = 0; i < mas.length; i++){
              for (int j = 0; j < mas.length - i - 1; j++){
                if (mas[j] > mas[j + 1]) {
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;

                }
            }
                    logStep(Arrays.toString(mas));
            }
            return mas;
    }

    public static void logStep(String note){
            try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    String timestamp = dateFormat.format(new Date());
                    fileWriter.write(timestamp + " " + note + "\n");
            } catch (IOException e) {
                    e.printStackTrace();
            }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
      int[] arr = {};

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 4, 8, 3, 1};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }

      BubbleSort ans = new BubbleSort();
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 */