package generics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox8 {
  public static void main(String[] args) {
    new Jukebox8().go();
    SongV0 song1 = new SongV0("artist", "title", 1);
    SongV0 song2 = new SongV0("artist", "title", 1);

    String a = "123";
    String b = "123";
    System.out.println(song1.equals(song2));
  }

  public void go() {
    List<SongV3> songList = MockMoreSongs.getSongsV3();
    System.out.println(songList);

    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);

    Set<SongV3> songSet = new HashSet<>(songList);
    System.out.println(songSet);
  }
}
