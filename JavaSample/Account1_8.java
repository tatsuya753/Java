public class Account1_8 implements Comparable<Account1_8> {
  int number;    //口座番号
  int zandaka;    //残高
  public int compareTo(Account1_8 obj) {
    if (this.number < obj.number) {
      return -1;
    }
    if (this.number > obj.number) {
      return 1;
    }
    return 0;
  }
}