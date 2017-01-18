/**
 * Created by ДОМ on 18.01.2017.
 */
public class ArraysBubble {
    public static void main(String[] args) {
        int a, b, t;
        int size = 10;
        int nums[] = new int[size];

        System.out.println();//случайный массив
        System.out.println("Исходный массив до сортировки имеет вид:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.round(Math.random() * 100);
             System.out.print(nums[i]+" ");
        }

        for (a=1; a<nums.length; a++) // Пузырьковая сортировка
            for (b=nums.length-1; b>=a; b--){
            if ( nums[b-1]>nums[b]){
                t=nums[b-1];
                nums [b-1] = nums [b];
                nums [b] = t;
            }
        }
        System.out.println();
        System.out.println("Итоговый массив после сортровки имеет вид:");
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
