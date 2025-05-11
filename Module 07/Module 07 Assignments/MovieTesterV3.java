/**
 * Purpose: to test the movie class
 *
 * @author William Van Uiert
 * @version 01/27/25
 *
 */

 public class MovieTesterV3 {

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

    public static void titleSort(Movie[] movies, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;

        for(i = movies.length - 1; i >= 0; i--) {
            posMax = 0;
            for(k = 0; k<= i; k++) {
                if(parameter == 1 && movies[k].getTitle().compareTo(movies[posMax].getTitle()) > 0) {
                    posMax = k;
                }
                else if(parameter == 2 && movies[k].getTitle().compareTo(movies[posMax].getTitle()) < 0) {
                    posMax = k;
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        }
    }

    public static void yearSort(Movie[] movies, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;

        for(i = movies.length - 1; i >= 0; i--) {
            posMax = 0;
            for(k = 0; k<= i; k++) {
                if(parameter == 1 && movies[k].getYear() > movies[posMax].getYear()) {
                    posMax = k;
                }
                else if(parameter == 2 && movies[k].getYear() < movies[posMax].getYear()) {
                    posMax = k;
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        }
    }

    public static void studioSort(Movie[] movies, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;

        for(i = movies.length - 1; i >= 0; i--) {
            posMax = 0;
            for(k = 0; k<= i; k++) {
                if(parameter == 1 && movies[k].getStudio().compareTo(movies[posMax].getStudio()) > 0) {
                    posMax = k;
                }
                else if(parameter == 2 && movies[k].getStudio().compareTo(movies[posMax].getStudio()) < 0) {
                    posMax = k;
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
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
