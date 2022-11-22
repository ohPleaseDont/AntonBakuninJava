import java.util.Scanner;

public class Zadanie_1 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Для else ТЗ не написали:)");
        }

    }
}