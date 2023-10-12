import java.util.*;

public class Main1_5 {
  public static void main(String[] args) {
    // HashSetを利用
    Set<Hero1_5> list = new HashSet<>();
    Hero1_5 h1 =new Hero1_5();
    h1.name = "ミナト";
    list.add(h1);
    System.out.println("要素数=" + list.size());
    h1 = new Hero1_5();
    h1.name = "ミナト";
    list.remove(h1);
    System.out.println("要素数=" + list.size());
  }
}