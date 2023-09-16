import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("java");
    list.add("学習");
    list.add("楽しもう！");

    Iterator<String> it = list.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}