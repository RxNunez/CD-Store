package discs;

/**
 * Created by Guest on 7/31/17.
 */
public class Album {
    public String artistname;
    public String albumname;
    public int year;
    public int price;

    public boolean albumYear(int userAlbumYear){
        return (year == userAlbumYear);
    }

    public Album(String artistname, String albumname, int year, int price){
        this.artistname = artistname;
        this.albumname = albumname;
        this.year = year;
        this.price = price;
    }
}

