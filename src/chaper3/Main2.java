package chaper3;

public class Main2 {
    public static void main(String[] args){
        int [] arraysOfIntegers = new int[10];
        for (int i = 1; i < arraysOfIntegers.length; i++) {
            arraysOfIntegers[i] = i*10;
        }
        for (int i = 1; i < arraysOfIntegers.length; i++) {
            System.out.println("Element " + i + " In the array is " + arraysOfIntegers[i]);
        }
    }
}
