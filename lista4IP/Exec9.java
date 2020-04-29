//finalizado
import java.util.ArrayList;

public class Exec9 {
    public static void pairIndex (int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                res.add(i);
            }
        }

        for (int j = 0; j < res.size(); j++) {
            System.out.print(res.get(j) + " ");
        }
    }
    public static void main (String[] args) {
        int[] a = {3,6,3,79,6,3,1,2,5};
        pairIndex(a);
    }
}