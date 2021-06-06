import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int arr[] = new int[15];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        System.out.print("Количество четных элементов массива: " + count);
    }
}