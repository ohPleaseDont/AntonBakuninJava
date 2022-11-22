import java.util.Scanner;

public class Zadanie_2 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        String Vyacheslav = "Вячеслав";

        if (name.equals(Vyacheslav)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}