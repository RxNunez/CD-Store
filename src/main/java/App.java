import discs.Album;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Created by Guest on 7/31/17.
 */
public class App {
    public static void main(String[] args) {

        boolean programRunning = true;

        Album rock = new Album("Def Leppard", "Hysteria", 1987, 20);
        Album classical = new Album("Mozart", "Piano Concerto", 1780, 40);
        Album jazz = new Album("Ella Fitzgerald", "Flying Home", 1945, 30);
        Album rap = new Album("Sugarhill Gang", "Sugarhill Gang", 1980, 25);
        Album pop = new Album("Christina Aguillara", "Mi Reflejo", 2000, 15);

        ArrayList<Album> allAlbums = new ArrayList<Album>();

        allAlbums.add(rock);
        allAlbums.add(classical);
        allAlbums.add(jazz);
        allAlbums.add(rap);
        allAlbums.add(pop);
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our CD Store. What would you like to do? Enter one of the following options: Enter one of the following options: All Albums, Search Release Year, Price Range, Artist Name, or Exit");

            try {

                String navigationChoice = bufferedReader.readLine();

                if (navigationChoice.equals("All Albums")) {
                    for (Album individualAlbum : allAlbums) {
                        System.out.println("________________");
                        System.out.println(individualAlbum.artistname);
                        System.out.println(individualAlbum.albumname);
                        System.out.println(individualAlbum.year);
                        System.out.println(individualAlbum.price);

                    }
                } else if (navigationChoice.equals("Search Release Year")) {
                    System.out.println("What is the album's release year?");
                    String stringUserAlbumYear = bufferedReader.readLine();
                    int userAlbumYear = Integer.parseInt(stringUserAlbumYear);
                    System.out.println("Here are the albums we have from that year");
                    for (Album individualAlbum : allAlbums) {
                        if (individualAlbum.albumYear(userAlbumYear)) {
                            System.out.println("________________");
                            System.out.println(individualAlbum.artistname);
                            System.out.println(individualAlbum.albumname);
                            System.out.println(individualAlbum.year);
                            System.out.println(individualAlbum.price);

                        }


                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
