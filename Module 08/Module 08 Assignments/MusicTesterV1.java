public class MusicTesterV1 {

    public static void printTable(Music[] songs) {
        System.out.println();
        System.out.println("Title\t\tYear\t\tArtist");
        for(int i = 0; i < 45; i++) {
            System.out.print("=");
        }
        System.out.println();
        for(Music song : songs) {
            System.out.printf("%s\t\t%d\t\t%s\n", song.getTitle(), song.getYear(), song.getArtist());
        }
    }

    public static void titleSearch(Music[] songs, String title) {
        for(Music song : songs) {
            if(song.getTitle().equals(title)) {
                System.out.println(song.toString());
                return;
            }
        }
        System.out.println("Song Not Found");
    }

    public static void yearSearch(Music[] songs, int year) {
        boolean found = false;
        for (Music song : songs) {
            if(song.getYear() == year) {
                System.out.println(song.toString());
                found = true;
            }
        }
        if(!found) {
            System.out.println("Song Not Found");
        }
    }

    public static void artistSearch(Music[] songs, String artist) {
        boolean found = false;
        for (Music song : songs) {
            if(song.getArtist().equals(artist)) {
                System.out.println(song.toString());
                found = true;
            }
        }
        if(!found) {
            System.out.println("Song Not Found");
        }
    }

    public static void main(String[] args) {
        Music[] songs = {
            new Music("Song A", 2000, "Artist A"),
            new Music("Song B", 1996, "Artist B"),
            new Music("Song C", 2001, "Artist C"),
            new Music("Song D", 2002, "Artist D"),
            new Music("Song E", 2000, "Artist A"),
            new Music("Song F", 1997, "Artist E"),
            new Music("Song G", 2012, "Artist F"),
            new Music("Song H", 1996, "Artist C"),
            new Music("Song I", 2005, "Artist G"),
            new Music("Song J", 2003, "Artist H"),
        };
        printTable(songs);
        System.out.println();
        System.out.println("Searching for Title:");
        titleSearch(songs, "Song A");
        titleSearch(songs, "Song blah");
        System.out.println();
        System.out.println("Searching for Year:");
        yearSearch(songs, 1950);
        yearSearch(songs, 2000);
        System.out.println();
        System.out.println("Searching for Artist:");
        artistSearch(songs, "Artist A");
        artistSearch(songs, "Artist X");
        System.out.println();
    }
}
