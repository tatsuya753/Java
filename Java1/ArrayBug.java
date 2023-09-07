class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[5];

    name[0] = "田中";
    name[1] = "佐藤";
    name[2] = "宗像";
    name[3] = "田村";
    name[4] = "鈴木";

    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}