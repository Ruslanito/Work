package com.ruslanito.Core_String;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class Srting_Summ {
    public static void main(String[] args) {
        String s1 = "Первая строка ";
        String s2 = "Вторая строка ";
        String s3 = s1 + s2;
        System.out.println("Итоговая строка имеет вид: " + s3);

        System.out.println("StringBuffer ()");
        StringBuffer s = new StringBuffer();
        s.append("Hello ");
        s.append("World!");
        String s4 = s.toString();
        System.out.println("StringBuffer () " + s4);

        System.out.println("concat()");
        String s5 = "Первая строка ";
        String s6 = s5.concat("Вторая строка");
        System.out.println("concat() " + s6);
        System.out.println(s5.concat("Вторая строка"));
    }

}
