import java.util.Arrays;

class MyArray {
    public int[] arr;
    public MyArray(int[] arr) {
        this.arr = arr;
    }

    public int[] rightShift() {
        int[] B = new int[arr.length];
        for(int i = 0; i < arr.length; ++i) {
            if(i == arr.length - 1) {
                B[0] = arr[i];

            } else {
                B[i+1] = arr[i];

            }
        }
        return B;
    }

    public int[] leftShift() {
        int[] B = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; --i) {
            if(i == 0) {
                B[arr.length - 1] = arr[0];
            } else {
                B[i - 1] = arr[i];

            }
        }
        return B;
    }

    public int getSecondLargest() {
        int secondLargest, largest;
        secondLargest = largest = arr[0];
        for(var x : arr) {
            if(x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest) {
                secondLargest = x;
            }
        }
        return secondLargest;
    }
    public static void printIt(int[] arr) {
        System.out.print("[");
        for(var x : arr) {
            if( x != arr[arr.length - 1]) {
                System.out.printf("%d ,", x);
            } else {
                System.out.printf("%d", x);
            }
        }
        System.out.print("]");
    }
}

public class BasicArrayChallenge {


    public static void main(String[] args) {
        System.out.println("Find the sum of all array elements!");
        int[] A = {3, 8, 7, 2, 34, 29, 6, 23};
        MyArray myArr = new MyArray(A);
        MyArray.printIt(myArr.rightShift());
        MyArray.printIt(myArr.leftShift());
    }
}
