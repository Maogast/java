public class StringWrapper {
  public String s;

  static void changeString(StringWrapper t) {
    t.s += " World";
  }

  static void change(StringWrapper t) {
    t.s += ("World is changed ");
  }

  public static void main(String args[]) {
    StringWrapper st = new StringWrapper();
    st.s = "Hello";
    changeString(st);
    System.out.println(st.s);
    change(st);
    System.out.println(st.s);

  }
}
