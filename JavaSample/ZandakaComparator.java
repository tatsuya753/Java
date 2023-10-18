import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account1_9> {
  public int compare(Account1_9 x, Account1_9 y){
    return (x.zandaka - y.zandaka);
  }
}