package generics;

public class SongV0 {
    String artist;
    String title;

    int bpm;

    SongV0(String artist, String title, int bpm){
        this.artist = artist;
        this.title = title;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
