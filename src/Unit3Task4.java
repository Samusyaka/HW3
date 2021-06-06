import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = zero;
            }
            System.out.print(arr[i] + " ");
        }
    }
}