public class Sword1_12 implements Cloneable {
  private String name;

  public Sword1_12 clone() {
    Sword1_12 result = new Sword1_12();
    result.name = this.name;
    return result;
  }

  public Sword1_12() {
    this.name = "";
  }
  public Sword1_12(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
}