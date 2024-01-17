/**
 * Program to check if the array is sorted or not using recursion
 */



public class sortedArray {

    public int sorted(int[] A, int index) {
        if(A.length == 1 || index == 1) 
            return 1;
        return (A[index - 1] < A[index - 2]? 0 : sorted(A, index - 1));
    }

    public static void main(String[] args) {
        sortedArray obj = new sortedArray();

        int[] arr_1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        int[] arr_2 = new int[10];

        for (int i = 0; i < arr_2.length; i++) 
            arr_2[i] = (int)(Math.random() * 10);


        System.out.println("Array 1: ");
        for (int i : arr_1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        for (int i : arr_2) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (obj.sorted(arr_1, arr_1.length) == 1) 
            System.out.println("Array" + 1 + " is sorted");
        else
            System.out.println("Array" + 1 + " is not sorted");


        if (obj.sorted(arr_2, arr_2.length) == 1) 
            System.out.println("Array" + 2 + " is sorted");
        else
            System.out.println("Array" + 2 + " is not sorted");
    }       
}
