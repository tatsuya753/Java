import java.util.ArrayList;

public class ArrayListSample{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("基礎");
    list.add("学習!!");

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}