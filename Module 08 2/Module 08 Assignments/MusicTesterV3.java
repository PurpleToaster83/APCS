/**
 * Purpose: to test a music class
 *
 * @author William Van Uitert
 * @version 02/7/2025
 *
 */

public class MusicTesterV3 {

    public static void mergeSortTitle(Music[] songs, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Music[] L = new Music[n1];
        Music[] R = new Music[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = songs[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = songs[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getTitle().compareTo(R[j].getTitle()) <= 0) {
                songs[k] = L[i];
                i++;
            }
            else {
                songs[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            songs[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            songs[k] = R[j];
            j++;
            k++;
        } 
    }

    public static void mergeSortYear(Music[] songs, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Music[] L = new Music[n1];
        Music[] R = new Music[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = songs[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = songs[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getYear() <= R[j].getYear()) {
                songs[k] = L[i];
                i++;
            }
            else {
                songs[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            songs[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            songs[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSortArtist(Music[] songs, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Music[] L = new Music[n1];
        Music[] R = new Music[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = songs[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = songs[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getArtist().compareTo(R[j].getArtist()) <= 0) {
                songs[k] = L[i];
                i++;
            }
            else {
                songs[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            songs[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            songs[k] = R[j];
            j++;
            k++;
        }
    }

    public static void merge(Music[] songs, String param, int l, int r) {
        if(l < r) {
            int m = l + (r - l) / 2;
            merge(songs, param, l, m);
            merge(songs, param, m + 1, r);

            if(param.equals("Title")) {
                mergeSortTitle(songs, l, m, r);
            }
            else if(param.equals("Year")) {
                mergeSortYear(songs, l, m, r);
            }
            else if(param.equals("Artist")) {
                mergeSortArtist(songs, l, m, r);
            }

        }
    }

    public static String titleSearch(Music[] songs, String title) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high - low > 1) {
            probe = (high + low) / 2;
            if(songs[probe].getTitle().compareTo(title) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }

        if((low >= 0) && (songs[low].getTitle().compareTo(title)) == 0) {
            Music found = songs[low];
            return found.toString();
        }
        return title + " not Found";
    }

    public static String yearSearch(Music[] songs, int year) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high - low > 1) {
            probe = (high + low) / 2;
            if(songs[probe].getYear() > year) {
                high = probe;
            }
            else {
                low = probe;
            }
        }

        if((low >= 0) && (songs[low].getYear() == year)) {
            Music found = songs[low];
            return yearDupSearch(songs, low, found);
        }
        return "Year " + year + " not Found";
    }

    public static String artistSearch(Music[] songs, String artist) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high - low > 1) {
            probe = (high + low) / 2;
            if(songs[probe].getArtist().compareTo(artist) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }

        if((low >= 0) && (songs[low].getArtist().compareTo(artist) == 0)) {
            Music found = songs[low];
            return artistDupSearch(songs, low, found);        
        }
        return artist + " not Found";
    }

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

    public static String yearDupSearch(Music[] songs, int low, Music song) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && songs[i].getYear() == song.getYear()) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getYear() == song.getYear())) {
            end = i;
            i++;
        }
        String returnStatment = "";
        for(i = start; i <= end; i++) {
            returnStatment += songs[i].toString() + "\n";
        }
        return returnStatment;
    }

    public static String artistDupSearch(Music[] songs, int low, Music song) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && songs[i].getArtist().compareTo(song.getArtist()) == 0) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < songs.length) && (songs[i].getArtist().compareTo(song.getArtist()) == 0)) {
            end = i;
            i++;
        }
        String returnStatment = "";
        for(i = start; i <= end; i++) {
            returnStatment += songs[i].toString() + "\n";
        }
        return returnStatment;
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
        String searchResult;

        System.out.println();
        System.out.println("Original:");
        printTable(songs);
        System.out.println();

        System.out.println("Searching for Titles:");
        merge(songs, "Title", 0, songs.length - 1);
        searchResult = titleSearch(songs, "Song B");
        System.out.println(searchResult);
        searchResult = titleSearch(songs, "Song Z");
        System.out.println(searchResult);
        System.out.println();

        System.out.println("Searching for Years:");
        merge(songs, "Year", 0, songs.length - 1);
        searchResult = yearSearch(songs, 2000);
        System.out.println(searchResult);
        searchResult = yearSearch(songs, 1800);
        System.out.println(searchResult);
        System.out.println();

        System.out.println("Searching for Artists:");
        merge(songs, "Artist", 0, songs.length - 1);
        searchResult = artistSearch(songs, "Artist C");
        System.out.println(searchResult);
        searchResult = artistSearch(songs, "Artist Z");
        System.out.println(searchResult);
        System.out.println();
    }
}
