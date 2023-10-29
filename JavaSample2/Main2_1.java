public class Main2_1 {
  //printsメソッド
  //第１引数の文字列を第２引数の回数だけ表示します
  //第１引数には文字列情報を、第２引数には整数を指定してください
  public static void prints(Object a, Object b) {
    for (int i = 0; i < (Integer)b; i++) {
      System.out.println(a);
    }
  }
  public static void main(String[] args) {
    //sには勇者も文字列も格納可能
    Object s = "こんにちは";
    s = new Hero2_1();
    Object n = 1;
    //注意深く呼び出す必要がある
    prints(s, n);
  }
}