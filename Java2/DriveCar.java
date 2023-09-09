class DriveCar{
  public static void main(String[] args){
    //Carクラスのオブジェクトc1を生成
    Car c1 = new Car();

    //自動車c1のナンバーを2525に設定
    c1.setNo(2525);

    //自動車c1の速度を30に設定
    c1.run(30);

    //自動車c1のナンバー、速度を表示
    c1.display();

    //自動車c1の速度を0に設定
    c1.stop();

    //自動車c1のナンバー、速度を表示
    c1.display();
  }
}