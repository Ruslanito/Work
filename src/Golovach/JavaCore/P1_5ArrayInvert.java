package Golovach.JavaCore;

import java.util.Arrays;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_5ArrayInvert {
    public static void main(String[] args) {
        int [] arr = new int [10];

        System.out.println(arr.length);
        for (int i=0; i < arr.length; i++){
            arr [i] = (int) (Math.round(Math.random()*100) );
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Исходный массив имеет вид:");
        System.out.print(Arrays.toString(arr));




    }
}
