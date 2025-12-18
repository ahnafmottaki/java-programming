public class WrapperClasses {

  public static void main(String[] args) {
    System.out.println("Wrapper classes");
    Integer i1 = new Integer(23);
    Integer i2 = Integer.valueOf(23);
    Integer i3 = 23;
    Byte b1 = 15;
    Byte b2 = Byte.valueOf("23");
    byte bb = 15;
    Byte b3 = Byte.valueOf(bb);
    Short s1 = Short.valueOf("345");
    Float f1 = 12.3f;
    Float f2 = Float.valueOf("342");
    Double d1 = Double.valueOf(34243);
    Character c1 = Character.valueOf('2');
    Boolean bo1 = Boolean.valueOf("true");
    float x = f1.floatValue();
    float y = f1;
  }
}
