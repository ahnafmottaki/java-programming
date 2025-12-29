public class Primitives {
  public static void main(String[] args) {
    System.out.println("Learning integer");
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Max Integer Value: " + myMaxIntValue);
    int myMinIntValue = Integer.MIN_VALUE;
    System.out.println("Min Integer Value: " + myMinIntValue);
    System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")");
    System.out.println("Overflowing numbers");
    System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
    System.out.println("Busted Min Value = " + (myMinIntValue - 1));
    int myMaxIntTest = 2_147_483_647;
    System.out.println(myMaxIntTest);
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Max Byte Value: " + myMaxByteValue);
    byte myMinByteValue = Byte.MIN_VALUE;
    System.out.println("Max Byte Value: " + myMinByteValue);
    System.out.println(myMaxIntTest);
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Max Short Value: " + myMaxShortValue);
    short myMinShortValue = Short.MIN_VALUE;
    System.out.println("Max Short Value: " + myMinShortValue);
    System.out.println("A Long has a width of " + Long.SIZE);
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Max Long Value: " + myMaxLongValue);
    long myMinLongValue = Long.MIN_VALUE;
    System.out.println("Min Long Value: " + myMinLongValue);
  }
}
