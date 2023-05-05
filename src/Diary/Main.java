package Diary;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Dairy dairy = new Dairy("IK", "1234");

    private static Scanner keyboardInputCollector = new Scanner(System.in);

    // private static Entry entry = new Entry();

    public static void main(String[] args) {
        gotoDaiyRoom();
    }

    private static void gotoDaiyRoom() {
        String DairyRoom = """
            Welcome Our Dairy Room
            1 -> Create Entry
            2 -> View Entry
            3 -> Delete Entry
            4 -> Count Entry
            5 -> Edit Entry
            6 -> Exit Entry
                        """;
        String userInput = input(DairyRoom);
        switch(userInput.charAt(0)){
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> countEntry();
            // case '5' -> editEntry();
            case '6' -> existEntry();
        }
    }

    private static void viewEntry() {
        int entryId = 0;
        entryId = Integer.parseInt((input("Enter id")));
        display(dairy.viewEntry(entryId));
        gotoDaiyRoom();

    }

//    private static void editEntry() {
//        display(entry.getBody());
//        gotoDaiyRoom();
//    }

    private static void existEntry() {
        display("Thanks for your time !!!");
        System.exit(1);
    }

    private static void countEntry() {
        gotoDaiyRoom();
    }

    private static void deleteEntry() {
        int entryId = 0;
        input("Enter id of the entry you want to delete");
        dairy.deleteEntry(entryId);
        display("Your Dairy is Successfully Deleted !!!");
        gotoDaiyRoom();


    }
//
//    private static void viewEntry() {
//       input("Enter id of the entry you want to view");
//
//        gotoDaiyRoom();
//    }

    private static void createEntry() {
        String title = input("Enter a tittle for your Entry");
        String body = input("Enter a body of your Entry");
        String iD = input("Enter an ID");
        dairy.createEntry(title, body, iD);
        display ("Your Dairy is Successfully Created !!!");
        gotoDaiyRoom();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);

    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}
