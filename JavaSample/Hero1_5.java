import java.util.Objects;

class Hero1_5 {
  public String name;
  // hashCodeのオーバーライド
  public int hashCode(){
    return Objects.hash(this.name);
  }
  // equalsのオーバーライド
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Hero1_5)) return false;
    Hero1_5 h = (Hero1_5) o;
    if(!this.name.trim().equals(h.name.trim())) {
      return false;
    }
    return true;
  }
}