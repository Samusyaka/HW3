public class Unit3Task2 {
    public static void main(String[] args) {
        int countpoint = 1;
        int razm = 50;
        int[] mass = new int[razm];
        {

            for (int i = 0; i < razm; i++) {
                {
                    mass[i] = countpoint;
                    countpoint += 2;
                }

            }
            System.out.println("Прямой вывод");
            for (int i = 0; i < razm; i++) {
                System.out.print(mass[i] + " ");
            }

            System.out.println();
            System.out.println("Инвертированный вывод");
            for (int i = 0; i < razm; i++) {
                int tmp = mass[i];
                mass[i] = mass[razm - i - 1];
                mass[razm - i - 1] = tmp;

                System.out.print(mass[i] + " ");
            }
        }
    }
}
