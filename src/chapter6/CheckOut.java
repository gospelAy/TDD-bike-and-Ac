package chapter6;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class CheckOut {

        public static void main(String[] args) {
            CheckOut checkOut = new CheckOut();
            checkOut.customerName();
        }

        String customerName;
        Scanner input = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        List<Integer> quantities = new ArrayList<>();
        List<Integer> prices = new ArrayList<>();
        String cashierName;
        int discount;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm");
        int subTotal;
        double finalVat;
        int finalDiscount;
        int payment;
        int amountPaid;
        double balance;

        public void customerName() {
            System.out.println("What is the Customer Name: ");
            customerName = input.nextLine();
            customerOrder();
        }

        private void customerOrder() {
            System.out.println("What did the Customer Buy: ");
            String itemBought = input.next();
            items.add(itemBought);

            System.out.println("How many pieces: ");
            int pieces = input.nextInt();
            quantities.add(pieces);

            System.out.println("How much per Unit: ");
            int price = input.nextInt();
            prices.add(price);

            System.out.println("Would you like to add more Items: ");
            String moreItems = input.next();

            if (moreItems.equalsIgnoreCase("yes")) customerOrder();
            else cashiersDetails();
        }

        private void cashiersDetails() {
            System.out.println("Enter Cashier Name: ");
            cashierName = input.next();
            System.out.println("Enter Percentage Discount: ");
            discount = input.nextInt();
            generateReceipt();
        }

        private void dashLine() {
            for (int i = 0; i < 50; i++) {
                System.out.print("= ");
            }
            System.out.println();
        }

        private void generateReceipt() {
            System.out.println("""
                    Semicolon Stores
                    Main Branch
                    Location: 312 Herbert Way Sabo, Yaba
                    Tel: 08069580949
                    """);
            System.out.println("Date of purchase: " + LocalDateTime.now());
            System.out.println("Cashier's Name: "  + cashierName);
            System.out.println("Customer's Name: " + customerName);
            dashLine();
            System.out.printf("%50s%10s%10s%10s%n", "ITEM", "QUANTITY", "PRICE", "TOTAL");
            dashLine();
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%47s %10d %10d %10d %n", items.get(i), quantities.get(i), prices.get(i),
                        quantities.get(i) * prices.get(i));

                subTotal += (quantities.get(i) * prices.get(i));
            }

            dashLine();
            System.out.printf("%70s%10d%n", "Sub Total: ", subTotal);
            System.out.printf("%70s%10d%n", "Discount: ", finalDiscount = ((discount * 100) / subTotal));
            System.out.printf("%70s%10.2f%n", "VAT: ", finalVat = ((7.5 * 100) / subTotal));
            dashLine();
            System.out.printf("%70s%10.2f%n", "BillTotal: ", subTotal + finalVat - finalDiscount);
            dashLine();
            System.out.printf("This is not a Final receipt, kindly pay %40s%10%d%n ",  (subTotal + finalVat - finalDiscount));
            dashLine();
            System.out.print("How much did the customer pay:                                               ");
            int amountPaid = input.nextInt();
            double balance = amountPaid-subTotal;
            System.out.printf("Balance: %10f%n", balance);





        }


    }

