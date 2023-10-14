public class Account {
  String accountNo;  // 口座番号（先頭に空白がが入ることもある）
  // equalsのオーバーライド
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if(!(o instanceof Account)) return false;
    Account r = (Account)o;
    if(!this.accountNo.trim().equals(r.accountNo.trim())) {
      return false;
    }
    return true;
  }
}