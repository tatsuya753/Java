class Hero1_11 implements Cloneable {
  String name;    // 名前
  int hp;         // HP
  Sword1_11 sword;    //装備している武器

  public Hero1_11 clone() {
    Hero1_11 result = new Hero1_11();
    result.name = this.name;
    result.hp = this.hp;
    result.sword = this.sword;
    return result;
  }

//cloneをpublicでオーバーライド
  public Hero1_11() {
    this.name = "";
  }
  public Hero1_11(String name) {
    this.name = name;
  }
  public Sword1_11 getSword1_11(){
    return this.sword;
  }
  public void setSword1_11(Sword1_11 sword) {
    this.sword = sword;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
}