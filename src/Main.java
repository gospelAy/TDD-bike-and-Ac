public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("found number " + i);
                count++;
                sum += i;
            }
            if (count == 5)
                break;
        }
        System.out.println("The sum is " + sum);
    }
}
//        int number = 4;
//        int finishNumber = 20;
//        int evenNumberFound = 0;
//        while (number <= finishNumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//            evenNumberFound++;
//            if (evenNumberFound == 5){
//                break;
//            }
//        }
//       System.out.println("Total even numbers found = " + evenNumberFound);
//
//   }
//   public static boolean isEvenNumber(int number){
//       if (number % 2 == 0) {
//           return true;
//       }else{
//         return false;
//       }
//   }
//}