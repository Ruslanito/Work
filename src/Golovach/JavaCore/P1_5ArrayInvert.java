package Golovach.JavaCore;

import java.util.Arrays;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_5ArrayInvert {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int i, k, m;

        m = arr2.length;
        System.out.println(arr.length);
        System.out.println(arr2.length);
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * 100));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Исходный массив имеет вид:");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.toString(arr2));


        for (k = m - 1, i = 0; i < arr.length; i++) {
            arr2[k - i] = arr[i];
        }

        System.out.println();
        System.out.println("Исходный массив имеет вид:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Инвертированный массив имеет вид:");
        System.out.println(Arrays.toString(arr2));

    }
}
