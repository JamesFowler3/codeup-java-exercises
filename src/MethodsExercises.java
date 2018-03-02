//import java.util.Scanner;
//
//    public class MethodsExercises {
//        public static void main(String[] args) {
//            getInteger();
//        System.out.println(division(2, 3));
//        }
//        public static int addition( int num, int num2){
//            return (num + num2);
//        }
//
//        public static int subtraction (int num, int num2) {
//        return (num - num2);
//        }
//        public static int multiplication (int num, int num2) {
//        return (num * num2);
//        }
//        public static double division (double num , double num2) {
//      return (num / num2);
//        }
//
//
//        public static String getInteger(int min, int max) {
//
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = sc.nextInt();
//            if (userInput >= min && userInput <= max) {
//                return userInput + " is in the range.";
//            } else {
//                return getInteger(min, max);
//            }
//            }
//        public static void getInteger() {
//
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number between 1 and 10 to find it's factoral: ");
//            int num = sc.nextInt();
//            int i,fact=1;
//            for (i = 1; i <= num; i++) {
//                fact = fact * i;
//                System.out.println(i + "!" + " = " + fact);
//            }
//    }
//            public static int randomWithRange ( int min, int max)
//            {
//                int range = (max - min) + 1;
//                return (int) (Math.random() * range) + min;
//            }
//
//            public static void rollDiceGame (Scanner sc){
//                String userChoice;
//                System.out.print("Please enter the number of sides for the dice: ");
//                int numberSides = getInteger(1, 20);
//                do {
//                    System.out.println("You have rolled a " + randomWithRange(1, numberSides) + " and a " + randomWithRange(1, numberSides));
//                    do {
//                        System.out.println("Would you like to roll again? [y/n]");
//                        userChoice = sc.next().trim();
//                    } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//
//                } while (!userChoice.equals("n"));
//            }
//        }


