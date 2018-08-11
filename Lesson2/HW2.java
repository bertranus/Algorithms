/**
 * Algorithms. Home Work 2.
 *
 * @author Albert Khayrutdinov
 * @version dated Aug 11, 2018
 * @link https://github.com/bertranus/Algorithms
 */

 /*
 * 1. Создать массив большого размера (миллион элементов).
 * 2. Написать методы удаления, добавления, поиска элемента массива.
 * 3. Заполнить массив случайными числами.
 * 4. Написать методы, реализующие рассмотренные виды 
    сортировок и проверить скорость выполнения каждой.
*/

import java.util.Arrays;

public class HW2 {
    int[] array;

    public static void main(String[] args) {
        HW2 my = new HW2();

        my.array = myArray.create(1000); // 1. Создать массив
        System.out.println("Created array " + Arrays.toString(my.array));

        myArray.delete(my, (int)(Math.random() * 
                my.array.length + 1)); // удаление
        System.out.println("Array after deleting " + 
                Arrays.toString(my.array));

        myArray.insert(my, (int)(Math.random() * my.array.length + 1), 
                (int)(Math.random() * my.array.length)); // добавлениe
        System.out.println("Array after inserting " + 
                Arrays.toString(my.array));

        boolean res = myArray.linearSearch(my, (int)(Math.random() * 
                (my.array.length + 1))); // поиск
        if (res) {
            System.out.println(" found");
        } else {
            System.out.println(" not found");
        }

        myArray.randomFill(my); //3. Заполнить массив случайными числами.
        System.out.println("Array with random values " + 
                Arrays.toString(my.array));

        Sort.bubble(my.array);

        Sort.selection(my.array);

        Sort.insertion(my.array);

        Sort.arraysSort(my.array);
    }

}

class myArray {

    public static int[] create(int size) {
        int[] out = new int[size]; 
        for (int i = 0; i < size; i++) {
            out[i] = i + 1;
        }
        return out;
    }

    public static void randomFill(HW2 my){
        int size = my.array.length;
        for (int i = 0; i < size; i++) {
            my.array[i] = (int)(Math.random() * size + 1);
        }
    }

    public static void insert(HW2 my, int value, int pos) {
        System.out.println("Inserted value " + value + " into " + 
                (pos + 1) + " position");
        int size = my.array.length;
        for (int j = size - 1; j > pos; j--) {
            my.array[j] = my.array[j - 1];
        }
        my.array[pos] = value;
    }

    public static boolean linearSearch(HW2 my, int search) {
        System.out.print("Searched value " + search);
        int size = my.array.length;
        for (int i = 0; i < size; i++) {
            if (my.array[i] == search) return true;
        }
        return false;
    }

    public static void delete(HW2 my, int search) {
        System.out.println("Deleted value " + search);
        int i;
        int size = my.array.length;
        for (i = 0; i < size; i++) {
            if (my.array[i] == search) break;
        }
        for (int j = i; j < size - 1; j++) {
            my.array[j] = my.array[j + 1];
        }
        my.array[size - 1] = 0;
    }

}

class Sort {

    public static void bubble(int[] array){
        long t1 = System.currentTimeMillis();
        int size = array.length;
        int out, in;
        for (out = size - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int tmp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = tmp;
                }
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Sorting with Bubble method takes " + 
                (t2 - t1) + " ms");
        //System.out.println(Arrays.toString(array));
    }

    public static void selection(int[] array){
        long t1 = System.currentTimeMillis();
        int size = array.length;
        int out, in, mark;
        for (out = 0; out < size; out++) {
            mark = out;
            for (in = out + 1; in < size; in++) {
                if (array[in] < array[mark]) {
                    mark = in;
                }
            }
            int tmp = array[out];
            array[out] = array[mark];
            array[mark] = tmp;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Sorting with Selection method takes " + 
                (t2 - t1) + " ms");
        //System.out.println(Arrays.toString(array));
    }

    public static void insertion(int[] array){
        long t1 = System.currentTimeMillis();
        int size = array.length;
        int out, in;
        for (out = 1; out < size; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Sorting with Insertion method takes " + 
                (t2 - t1) + " ms");
        //System.out.println(Arrays.toString(array));
    }

    public static void arraysSort(int[] array) {
        long t1 = System.currentTimeMillis();
        Arrays.sort(array);
        long t2 = System.currentTimeMillis();
        System.out.println("Sorting with Arrays.sort() method takes " + 
                (t2 - t1) + " ms");
        //System.out.println(Arrays.toString(array));
    }

}