import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();

        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {
            {
                mass[i] = r.nextInt();
            }
            System.out.print(mass[i] + " ");
        }


    }
}