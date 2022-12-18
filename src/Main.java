import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена из списка A:");
        for (int i = 0; i <= 4; i++) {
            name.add(scanner.nextLine());
        }
        System.out.println("Список:" + name);
        System.out.println("-----------------------");

        ArrayList<String> name2 = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите имена из списка Б:");
        for (int i = 0; i <= 4; i++) {
            name2.add(scanner2.nextLine());
        }
        System.out.println("Список:"+name2);

        ArrayList<String> name3= new ArrayList<>();
        name3.addAll(name);
        name3.add(1,name2.get(4));
        name3.add(3,name2.get(3));
        name3.add(5,name2.get(2));
        name3.add(7,name2.get(1));
        name3.add(9,name2.get(0));

        System.out.println(name3);
        Collections.sort(name3, Comparator.comparing(String::length));
        System.out.println(name3);

        }

    }
