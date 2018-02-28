import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        String message = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//        System.out.println(message);
//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//                He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//                He answers 'Whatever.' to anything else.
//
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Say something to Bob! ");
        userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
            System.out.println("Sure");
        }
            else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out");
        }
            else if (userInput.isEmpty()) {
            System.out.println("Fine. Be that way!");
        }
            else  {
            System.out.println("Whatever");
        }


    }
}
