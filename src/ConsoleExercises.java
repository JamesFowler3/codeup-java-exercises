import java.util.Scanner;

public class ConsoleExercises {
//    public static void main(String[] args) {
//        String wordOne;
//        String wordTwo;
//        String wordThree;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 3 words: ");
//        wordOne = sc.nextLine();
//        wordTwo = sc.nextLine();
//        wordThree = sc.nextLine();
//        System.out.println("You entered the word: --> \"" + wordOne + "\" <--");
//        System.out.println("You entered the word: --> \"" + wordTwo + "\" <--");
//        System.out.println("You entered the word: --> \"" + wordThree + "\" <--");
//
//    }
//    }

//    public static void main(String[] args) {
//        int userInput;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        userInput = sc.nextInt();
//        System.out.println("You entered the number: --> \"" + userInput + "\" <--");
//    }
//}
//
//    public static void main(String[] args) {
//        int width;
//        int length;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the width, then length: ");
//        width = sc.nextInt();
//        length = sc.nextInt();
//        System.out.println("You entered the width as : --> \"" + width + "\" <--");
//        System.out.println("You entered the length as: --> \"" + length + "\" <--");
//    }
//}


    public static void main(String[] args) {
        int width;
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width, then length: ");
        width = sc.nextInt();
        length = sc.nextInt();
        int area = width * length;
        int perimeter = (2 * width) + (2 * length);
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);
//        System.out.println("The area of the classroom is: --> \"" + width * length + "\" <--");
//        System.out.println("The perimter of the classroom is: --> \"" + 2 * width + 2 * length + "\" <--");
    }
}

