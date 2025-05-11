/**
 * Purpose: to test the movie class
 *
 * @author William Van Uiert
 * @version 01/23/25
 *
 */

 public class MovieTesterV2 {

    public static void printOut(Movie[] movies) {
        System.out.println("\n\tTitle\t\t\t\tYear\t\t\tStudio");
        for(int i = 0; i < 85; i++) {
            System.out.print("=");
        }
        System.err.println();

        for(Movie movie : movies) {
            System.out.printf("%-30s\t\t%4d\t\t%-20s\n", movie.getTitle(), movie.getYear(),  movie.getStudio());
        }
        System.out.println();
    }

    public static void titleSort(Movie[] movies, int direction) {
        if(direction == 1) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getTitle().compareTo(currentValue.getTitle()) >= 0) {
                    //check what j actually does
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }

        else if(direction == 2) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getTitle().compareTo(currentValue.getTitle()) <= 0) {
                    //check what j actually does
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }
    }

    public static void yearSort(Movie[] movies, int direction) {
        if(direction == 1) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getYear() > currentValue.getYear()) {
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }

        else if(direction == 2) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getYear() < currentValue.getYear()) {
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }
    }

    public static void studioSort(Movie[] movies, int direction) {
        if(direction == 1) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getStudio().compareTo(currentValue.getStudio()) >= 0) {
                    //check what j actually does
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }

        else if(direction == 2) {
            for(int i = 1; i < movies.length; i++) {
                Movie currentValue = movies[i];
                int j = i - 1;
                while(j >= 0 && movies[j].getStudio().compareTo(currentValue.getStudio()) <= 0) {
                    //check what j actually does
                    movies[j + 1] = movies[j];
                    j--;
                }
                movies[j + 1] = currentValue;
            }
        }
    }

    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Cars", 2006, "Pixar Animation Studios"),
            new Movie("Kung Fu Panda", 2008, "DreamWorks Animation"),
            new Movie("The Fellowship of the Ring", 2001, "New Line Cinema"),
            new Movie("Monsters Inc.", 2001, "Pixar Animation Studios"),
            new Movie("Ice Age", 2002, "Blue Sky Studios"),
            new Movie("Despicable Me", 2010, "Illumination Entertainment"),
            new Movie("The Battle of the Five Armies", 2014, "New Line Cinema"),
            new Movie("Toy Story", 1995, "Pixar Animation Studios"),
            new Movie("The Empire Stikes Back", 1980, "Lucasfilm Ltd."),
            new Movie("Avatar", 2009, "Lightstorm Entertainment"),
        };
        System.out.println("Original:");
        printOut(movies);
        System.out.println("Ascending Title Sort:");
        titleSort(movies, 1);
        printOut(movies);
        System.out.println("Descending Title Sort:");
        titleSort(movies, 2);
        printOut(movies);
        System.out.println("Ascending Year Sort:");
        yearSort(movies, 1);
        printOut(movies);
        System.out.println("Descending Year Sort:");
        yearSort(movies, 2);
        printOut(movies);
        System.out.println("Ascending Studio Sort");
        studioSort(movies, 1);
        printOut(movies);
        System.out.println("Descending Studio Sort");
        studioSort(movies, 2);
        printOut(movies);

    }
}
