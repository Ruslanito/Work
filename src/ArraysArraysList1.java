import java.util.ArrayList;
import java.util.Scanner;

/** Коллекция ArrayList
 * Created by Ruslanito on 31.01.2017.
 */
public class ArraysArraysList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        arr = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        while   (scanner.hasNext()){
            int q = scanner.nextInt();
            arr.add(q);//добавдение элемента в колл. с помощью add
            System.out.println(arr);//колл. в строчку
            System.out.println("Количество элементов коллекции равно "+arr.size());//количество элементов массива

            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));//колл. в столбик

            }
            arr.set(0,999);//замена элемента колл.№0 на 999
            System.out.println(arr);

            arr.remove(0);//удаление элемента колл.№0
            System.out.println(arr);
        }

    }
}
