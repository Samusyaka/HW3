import java.util.Random;
import java.util.Scanner;

public class Unit3Task9 {
    public static void main(String[] args) {
        System.out.print("Введите четное число: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        int sum1 = 0;
        int sum2 = 0;
        n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Введенное число нечетное");
        } else {
            int[] mass = new int[n];
            for (int i = 0; i < n; i++) {
                mass[i] = r.nextInt(15);
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n / 2; i++) {
                sum1 += mass[i];
            }
            System.out.println("Сумма элементов первой половины массива " + sum1);
            for (int i = n / 2; i < n; i++) {
                sum2 += mass[i];
            }
            System.out.println("Сумма элементов второй половины массива " + sum2);
            if (sum1 > sum2) {
                System.out.println("Сумма элементов первой половины массива больше суммы элементов второй половины массива");
            }
        else {
                System.out.println("Сумма элементов второй половины массива больше суммы элементов первой половины массива");
            }
        }
    }
}