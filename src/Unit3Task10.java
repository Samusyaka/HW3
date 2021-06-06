//и работает и не работает. иногда выводит в новый массив нечетное, иногда циклится на выводе. Пока не разобрался

import java.util.Random;
import java.util.Scanner;

public class Unit3Task10 {
    public static void main(String[] args) {
        System.out.print("Введите число больше 3: ");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n, tmp;
        n = sc.nextInt();
        if (n < 3) {
            System.out.println("Введенное число меньше 3");
        } else {
            int[] mass = new int[n];
            for (int i = 0; i < n; i++) {
                {
                    mass[i] = r.nextInt(100);
                }
                System.out.print(mass[i] + " ");
            }
            System.out.println();
            int count = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] % 2 == 0) {
                    count++; //подсчет элементов второго массива
                }
            }
            if (count == 0) {
                System.out.print("Нет элементов для заполнения массива");
            } else {
                int[] mass1 = new int[count];
                {
                    for (int i = 0; i < mass.length; i++) {
                        if (mass[i] % 2 == 0) {
                            for (i = 0; i < count; i++) {
                                tmp = mass[i];
                                mass1[i] = tmp;
                                {
                                    System.out.print(mass1[i] + " ");
                                }

                            }
                        }
                    }

                }

            }
        }
    }
}


