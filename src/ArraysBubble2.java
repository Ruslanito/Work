/**
 * Created by ДОМ on 23.01.2017.
 */
public class ArraysBubble2 {
    public static void main(String[] args) {
        int s = 5;// количество элементов массива
        int mas[] = new int[s];// массив mass
        int i = 0;
        int numOfPair = 0;



        while (true) {
            if (mas[i] > mas[i + 1]) {
                int q;
                q = mas[i];
                mas[i] = mas[i + 1];
                numOfPair = 0;
            } else {
                numOfPair++;
            }
            if (numOfPair == mas.length - 1) break;
            i++;
            if (i == mas.length - 1) {
                i = 0;
            }
            for (int x : mas)
                System.out.println(x);
                System.out.println("numOfPair =" + numOfPair);
        }
    }
}
