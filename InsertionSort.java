import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSort {

    public static void insertSortArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void insertSortList(List<Integer> l) {
        for (int i = 1; i < l.size(); i++) {
            int temp = l.get(i), j = i - 1;

            while (j >= 0 && l.get(j) > temp)
                l.set(j + 1, l.get(j--));
            l.set(j + 1, temp);
        }        
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println("Array before: = ");
        for (int i : arr) System.out.print(i + " ");
    
        insertSortArray(arr);

        System.out.println("\nArray after: = ");
        for (int i : arr) System.out.print(i + " ");
    
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < 10; i++) l.add(new Random().nextInt(100));

        System.out.println("\nList Before: ");
        for (Integer integer : l)
            System.out.print(integer + " ");
        insertSortList(l);
        System.out.println("\nList after: ");
        for (Integer integer : l)
            System.out.print(integer + " ");
    
    }
}
