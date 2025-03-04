package generics;

import java.util.ArrayList;
import java.util.List;

public class Jukebox6 {
  public static void main(String[] args) {
    new Jukebox6().go2 ();
  }

  public void go() {
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);

    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);

    songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songList);
  }

  public void go2() {
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);
    songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
    System.out.println(songList);
    songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songList);
    Object a = new Object();
  }
}
