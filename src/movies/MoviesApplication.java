package movies;
import util.Input;
public class MoviesApplication {
    public static void main(String[] args) {
        Movie MoviesArray[] = movies.MoviesArray.findAll();

//        Frankenstein -- horror
//        Goodfellas -- drama
//        Pulp Fiction -- drama
//...
        Input input = new Input();
        int userInput;
        do {
            System.out.println("What would you like to do?");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("");
            System.out.println("Enter your choice:");
            userInput = input.getInt(0, 5);

            if (userInput ==1) {
                for (Movie movie : MoviesArray) {
                    System.out.println(movie.getMovie() + " " + movie.getCategory());
                }
            }
            else if (userInput ==2) {
                for (Movie movie : MoviesArray){
                   if  (movie.getCategory().equals("animated")) {
                     System.out.println(movie.getMovie());
                    }
                }
            }
            else if (userInput ==3) {
                for (Movie movie : MoviesArray){
                    if  (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getMovie());
                    }
                }
            }
            else if (userInput ==4) {
                for (Movie movie : MoviesArray){
                    if  (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getMovie());
                    }
                }
            }
            else if (userInput ==5) {
                for (Movie movie : MoviesArray){
                    if  (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getMovie());
                    }
                }
            }
        }
        while (userInput != 0);

    }
}
