import java.util.*;

public class Main1_8 {
  public static void main(String[] args) {
    List<Account1_8> list = new ArrayList<>();
    Account1_8 a1 = new Account1_8();
    Account1_8 a2 = new Account1_8();
    a1.number = 200;
    a2.number = 100;
    list.add(a1);
    list.add(a2);

    System.out.println("ソート前 : ");
    for (Account1_8 a :list) {
      System.out.println(a.number);
    }

    Collections.sort(list);

    System.out.println("ソート後 : ");
    for (Account1_8 a :list) {
      System.out.println(a.number);
    }
  }
}