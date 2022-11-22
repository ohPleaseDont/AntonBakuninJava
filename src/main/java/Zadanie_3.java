import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int num = in.nextInt();
        int[] mass = new int[num];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
        }

        ArrayList<Integer> div3 = new ArrayList<>();
        for (int i=0; i < mass.length; i++) {
            if (mass[i] % 3 == 0) {
                div3.add(mass[i]);
            }
        }

        System.out.println(Arrays.toString(mass));
        System.out.println(div3);

    }
}