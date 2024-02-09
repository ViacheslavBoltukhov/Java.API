package src.homeWork5.Task3;

import java.util.Arrays;

class HeapSort {
    static void heapify(int[] arr, int arraySize, int current) {
        int max = current;
        int left = current * 2 + 1;
        int right = current * 2 + 2;

        if (right < arraySize && arr[right] > arr[max])
            max = right;

        if (left < arraySize && arr[left] > arr[max])
            max = left;

        if (max != current) {
            int temp = arr[current];
            arr[current] = arr[max];
            arr[max] = temp;
            heapify(arr, arraySize, max);
        }

    }

    public static void buildTree(int[] tree, int sortLength) {
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);

        for (int i = sortLength - 1; i >= 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;
            heapify(sortArray, i, 0);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
