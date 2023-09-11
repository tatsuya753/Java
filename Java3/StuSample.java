public class StuSample{
  public static void main(String[] args){
    Student stu = new Student();
    
    //スーパークラスのメソッド
    stu.setName("宗像");
    stu.display();
    
    //サブクラスのメッソド
    stu.setStuNo(1);
    stu.displayStuNo();
  }
}