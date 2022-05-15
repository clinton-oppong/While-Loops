public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("the value is  " + count);
//            count++;
//        }
//
//      /* for (int=1; i<7 i+=) {
//            System.out.println("the value is "+ count);
//        }
//       */
//
//         for ( count = 1; count != 6; i++) {
//              System.out.println(" the value is " + count);
//         }
//
//
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break; // this breaks out the loop
//            }
//            System.out.println(" the value is " + count);
//            count++;
//        }
//
//         count = 1; // do while runs the code one's before checkin the condition.
//        do {
//            System.out.println("the value is " + count);
//            count++;
//        }while (count!= 6);


//        int number = 4;
//        int finishNumber = 20;
//        int sum = 0;
//
//        while (number <= finishNumber){
//            number++;
//            if (isEvenNumber(number)){
//                sum++;
//
//            } else {
//                continue;
//            }
//            if (sum >= 5){
//                break;
//            }
//
//            System.out.println("the number " + number);
//        }
//
//        System.out.println("the total is " + sum);
//    }
//
//    public static boolean isEvenNumber(int number){
//        if (number % 2 == 0){
//            return true;
//        }else {
//            return false;

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(112212));
        System.out.println("\n new \n");
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));


   }

    public static boolean isPalindrome(int number) {
        int reverseNum = 0;
        int temp = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number = number / 10;
        }
        if (reverseNum == temp) {
            return true;
        }
        return false;
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int biggreCount = 0;
        biggreCount = bigCount * 5;
        int sum = biggreCount + smallCount;

        if (sum == goal || smallCount >= goal) {
            return true;
        } else if (sum <= goal || biggreCount > goal) {
            return false;
        }
        return false;
    }

}