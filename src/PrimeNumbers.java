
            public class PrimeNumbers {
                public static void main(String[] args) {
                    for (int i = 50; i >= 2; i--) {
                        boolean isPrime = true;
                        for (int j = 2; j <= i / 2; j++) {
                            if (i % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(i);
                        }
                    }
                }
            }

//            for (int i = 50; i >= 2; i--) {
//                if (isPrime(i)) {
//                    System.out.println(i);
//                }
//            }
//        }
//
//        public static boolean isPrime(int num) {
//            if (num < 2) {
//                return false;
//            }
//            for (int i = 2; i <= num/2; i++) {
//                if (num % i == 0) {
//                    return false;
//                }
//            }
////            return true;
//        }
//    }


