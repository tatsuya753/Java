class Array{
  public static void main(String[] args){
    int[] score = new int[3]; //配列の生成
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    String[] name = {"宗像", "菅原", "田中"}; //配列の初期化

    System.out.println(name[0] + "さん：" + score[0] + "点");
    System.out.println(name[1] + "さん：" + score[1] + "点");
    System.out.println(name[2] + "さん：" + score[2] + "点");
    System.out.println("受験者数：" + score.length + "名");
  }
}