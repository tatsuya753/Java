public class Main1_11 {
  public static void main(String[] args) {
    Hero1_11 h1 = new Hero1_11("ミナト");
    Sword1_11 s = new Sword1_11("はがねの剣");

    h1.setSword1_11(s);
    System.out.println("装備 :" + h1.getSword1_11().getName());
    System.out.println("clone()で複製します");
    Hero1_11 h2 = h1.clone();  //ここで複製

    System.out.println("コピー元の勇者の剣の名前を変えます");
    h1.getSword1_11().setName("ひのきの棒");
    System.out.println("コピー元とコピー先の勇者の装備を表示します");

    //実行するとコピー先の装備まで変わってしまう（浅いコピー）
    System.out.println("コピー元:" + h1.getSword1_11().getName() + "/ コピー先:" + h2.getSword1_11().getName() + " ←コピー先も変わってしまう");
  }
}