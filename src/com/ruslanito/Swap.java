package com.ruslanito;

/**
 * Created by Ruslanito on 12.02.2017.
 */
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        System.out.print("Исходные переменные до замены:");
        System.out.println(" a=" + a + "; b=" + b);
        Swap4 s = new Swap4(a, b);
        s.change(s);
        System.out.print("Переменные после замены через объект:");
        System.out.println(" a=" + s.a + "; b=" + s.b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.print("Переменные после замены в самом классе:");
        System.out.println(" a=" + a + "; b=" + b);
    }
}
class Swap4 {
    int a, b;

    Swap4(int i, int j) {
        a = i;
        b = j;
    }
    void change(Swap4 s) {
        int tmp = s.a;
        s.a = s.b;
        s.b = tmp;
    }
}
