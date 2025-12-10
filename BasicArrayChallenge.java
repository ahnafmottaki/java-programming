import java.util.Arrays;

class MyArray {
    public int[] arr;
    public MyArray(int[] arr) {
        this.arr = arr;
    }

    public MyArray delete(int pos) {
        int[] B = new int[arr.length - 1];
        for(int i = 0; i < arr.length; ++i) {
            if(i < pos) {
                B[i] = arr[i];
            } else if( i == pos) {
                continue;
            } else {
                B[i - 1] = arr[i];
            }

        }
        arr = B;
        return this;
    }

    public MyArray insert(int x, int pos){
         int B[] = new int[arr.length + 1];
         for(int i = 0; i < B.length; ++i) {
             if(i < pos) {
                 B[i] = arr[i];
             }else if(i == pos) {
                 B[i] = x;
             }  else {
                 B[i] = arr[i - 1];
             }
         }
         arr = B;
        return this;
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
        MyArray.printIt(myArr.insert(99, 1).arr);
        MyArray.printIt(myArr.delete(0).arr);

        System.out.println("Two dimensional array");
        // int[][] B = new int[3][4];
        // int[][]B = {{1, 2, 3, 4}, {2. 4, 6, 8}, {4, 6, 8 , 10}};
//        int[][] B; // this is a reference of two-dimensional array
//        B = new int[3][4]; // here we are initializing it
//        for(int row = 0; row < B.length; ++row) {
//            for(int col = 0; col < B[row].length; ++col) {
//                System.out.println(B[row][col]);
//            }
//        }
//
//        for(int[] x : B) {
//            for (var y: x) {
//                System.out.println(y);
//            }
//        }

//        creating jagged array
        int X[][];
        X = new int[3][];
        X[0] = new int[2];
        X[1] = new int[4];
        X[2] = new int[3];
    }

}
