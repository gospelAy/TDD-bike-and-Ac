package chaper3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a value (or 'q' to quit): ");
            String value = scanner.nextLine();
            if (value.equals("q")) {
                break;
            }
            list.add(value);
        }

        System.out.println("List: " + list);
    }
}

