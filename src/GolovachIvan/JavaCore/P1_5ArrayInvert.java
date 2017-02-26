package GolovachIvan.JavaCore;

import java.util.Arrays;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_5ArrayInvert {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int[] arr2 = new int[9];
        int i, k, temp;

        System.out.println(arr.length);
        System.out.println(arr2.length);
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * 100));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Исходный массив arr[] имеет вид:");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.toString(arr2));


        for (k = arr2.length - 1, i = 0; i < arr.length; i++) {
            arr2[k - i] = arr[i];
        }

        System.out.println();
        System.out.println("Исходный массив arr[] имеет вид:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Инвертированный массив arr2[] имеет вид:");
        System.out.println(Arrays.toString(arr2));

        System.out.println("С помощью временной переменной");
        System.out.println("Исходный массив arr[] имеет вид:");
        System.out.println(Arrays.toString(arr));
        for (k = arr.length - 1, i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[k - i];
            arr[k - i] = temp;
            System.out.print("arr[" + (k - i) + "]=" + arr[k - i] + " arr[" + i + "]=" + arr[i] + " temp=" + temp);
            System.out.println();
        }
        System.out.println();
        System.out.println("Инвертированный массив arr[] имеет вид:");
        System.out.println(Arrays.toString(arr));

    }
}
