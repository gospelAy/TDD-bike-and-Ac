import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class checkout {
    Scanner input = new Scanner(System.in);

//    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> qty = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();


//        checkout checkout = new checkout();
//        checkout.question1();
//        checkout.question2();
////        checkout.question3();



//    }

    public void question1() {
        System.out.println("What is the customer's Name");
        String Name = input.nextLine();

    }

    public void question2() {

        System.out.println("What did the user buy? ");
        String buy = input.nextLine();
        items.add(buy);

        System.out.println("How many pieces?");
        int pieces = input.nextInt();


        System.out.println("How much per unit? ");
        double unit = input.nextDouble();
        question3();
    }

    public void question3() {
        System.out.println("Add more items? ");
        String items = input.nextLine();
        input.nextLine();



        while(true) {

            if (items.equalsIgnoreCase("yes")) {
                question2();
                break;
            }

            else if (items.equalsIgnoreCase("no")) {
                question4();
                break;
            }

            else question3(); {break;}
        }
    }

    public void question4() {
        System.out.println("What is your name?");
        String name2 = input.nextLine();

        System.out.println("How much discount will he get?");
        int name3 = input.nextInt();
    }
}
