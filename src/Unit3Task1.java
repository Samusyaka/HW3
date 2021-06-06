public class Unit3Task1 {
    public static void main(String[] args) {
        int r = 2;
        int n = 10;
        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {
            {
                mass[i] = r;
                r += 2;
            }

        }
        System.out.println("Вывод в строку");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод в столбец");
        for (int i = 0; i < n; i++) {
            System.out.println(mass[i] + " ");
        }


    }
}

