package DeitelExercises;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrrayUnderstanding {

    public static void main(String[] args){
        ArrayList<String>list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Enter any value or 'q' to quit ");
            String value = input.nextLine();

            if (value.equals("q")){
                break;
            }
            list.add(value);
        }
        System.out.println("list" + list);
    }
}
