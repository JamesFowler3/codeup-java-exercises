public class ControlFlowExercises {
    public static void main(String[] args) {
//         int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
////        }
//        int i = -2;
//        do {
//            i += 2;
//            System.out.println(i);
//        }while (i < 100); {
//
//
//            }
//        int i = 100;
//        do {
//            i -= 5;
//            System.out.println(i);
//        }while (i > -10); {
//
//
//            }
//        int i = 2;
//        do {
//            i = i * i;
//            System.out.println(i);
//        }while (i < 1000); {
//
//
//        }
        for (int i = 1; i <= 100; i++) {
            boolean fizzOrBuzz = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(i));
            }
        }


    };
    }

