package generics;

//import __________________;

import java.util.ArrayList;
import java.util.List;

public class SortMountainsExercise {
  public static void main(String [] args) {
    new SortMountainsExercise().go();
  }

  public void go() {
    List<Mountain> mountains = new ArrayList<>();
    mountains.add(new Mountain("Longs", 14255));
    mountains.add(new Mountain("Elbert", 14433));
    mountains.add(new Mountain("Maroon", 14156));
    mountains.add(new Mountain("Castle", 14265));
    System.out.println("as entered:\n" + mountains);

    mountains.sort((one, two)-> one.name.compareTo(two.name));
    System.out.println("by name:\n" + mountains);

    mountains.sort((one, two)-> two.height - one.height);
    System.out.println("by height:\n" + mountains);
  }
}

class Mountain {
  String name;
  int height;

  Mountain(String name, int height) {
    this.name = name;
    this.height = height;
  }
  public String toString() {
    return name + " " + height;
  }
}