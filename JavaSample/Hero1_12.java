class Hero1_12 implements Cloneable {
  String name;    // 名前
  int hp;         // HP
  Sword1_12 sword;    //装備している武器

  public Hero1_12 clone() {
    Hero1_12 result = new Hero1_12();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword.clone();
    return result;
  }

//cloneをpublicでオーバーライド
  public Hero1_12() {
    this.name = "";
  }
  public Hero1_12(String name) {
    this.name = name;
  }
  public Sword1_12 getSword1_12() {
    return this.sword;
  }
  public void setSword1_12(Sword1_12 sword) {
    this.sword = sword;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
}