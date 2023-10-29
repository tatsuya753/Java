class Hero2_1 {
  String name;    //名前
  int hp;         // HP
  
  public Hero2_1() {
    this.name = "";
  }
  public Hero2_1(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
}