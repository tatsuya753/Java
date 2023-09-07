class DataType{
  public static void main (String[] args){
    int month = 12;
    int day = 29;
    float weight = 63.0f; //小数float型 f(F) をつける
    double height = 168.5;
    char bloodType = 'A'; //char型(1文字) 'シングルで囲む'

    String name = "宗像"; //参照型

    System.out.println("こんにちは！" + name + "です。");
    System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
    System.out.println("誕生日は" + bloodType + "型です。");
    System.out.println("よろしくお願いします。");
  }
}