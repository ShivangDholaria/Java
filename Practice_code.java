import java.util.ArrayList;
import java.util.List;

public class Practice_code {
    
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> revList = new ArrayList<Integer>();

        for (int i = a.size() - 1; i >= 0; i--) {
            revList.add(a.get(i));
        }

        return revList;
    }

    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<Integer>();
        
        int_list.add(5);
        int_list.add(7);
        int_list.add(9);
        int_list.add(6);
        int_list.add(9);
        int_list.add(1);
        
        System.out.println(reverseArray(int_list));
    }
}
