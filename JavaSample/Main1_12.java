public class Main1_12 {
  public static void main(String[] args) {
    Hero1_12 h1 = new Hero1_12("ミナト");
    Sword1_12 s = new Sword1_12("はがねの剣");

    h1.setSword1_12(s);
    System.out.println("装備 :" + h1.getSword1_12().getName());
    System.out.println("clone()で複製します");
    Hero1_12 h2 = h1.clone();  //ここで複製

    System.out.println("コピー元の勇者の剣の名前を変えます");
    h1.getSword1_12().setName("ひのきの棒");
    System.out.println("コピー元とコピー先の勇者の装備を表示します");

    //実行するとコピー先の装備まで変わってしまう（浅いコピー）
    System.out.println("コピー元:" + h1.getSword1_12().getName() + "/ コピー先:" + h2.getSword1_12().getName());
  }
}