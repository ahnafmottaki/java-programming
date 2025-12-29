public class TypeCasting {
  public static void main(String[] args) {
    System.out.println("Type casting in java");
    short myMinShortValue = Short.MIN_VALUE, myMaxShortValue = Short.MAX_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE, myMinByteValue = Byte.MIN_VALUE;
    byte myNewByteValue = (byte) (myMinByteValue / 2);
    short myNewShortValue = (short) (myMaxShortValue / 2);
  }
}
