package util;

import java.util.Scanner;

public class Input {
    private Scanner scan= new Scanner(System.in);

//    public input() {
//        scan = new Scanner(System.in);
//    }
    public String getString() {
        return scan.nextLine();
    }
//    public boolean yesNo() {
//        return scan.nextLine();
//
//    }
    public int getInt() {
        return scan.nextInt();
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            return getInt(min, max);
        }
        else {
            return userInt;
        }
    }
    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }
}
