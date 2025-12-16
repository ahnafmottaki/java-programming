package telusko;

public class JaggedArray {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    int nums[][] = new int[3][];
    nums[0] = new int[2];
    nums[1] = new int [3];
    nums[2] = new int[4];
    for(int i = 0; i < nums.length; ++i) {
      for(int j = 0; j < nums[i].length; ++j) {
        nums[i][j] = (int)(Math.random() * 10);
      }
    }
    for(int num[] : nums){
      for(int i : num) {
        System.out.println(i);
      }
    }
  }
}
