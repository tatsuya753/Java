class StuSample5{
  public static void main(String[] args){
    Student5 stu1 = new Student5("宗像");
    stu1.setScore(80);
    stu1.display();

    Student5 stu2 = new Student5("田中");
    stu2.setScore(-50);
    // stu2.setScore = -50;
    stu2.display();
  }
}