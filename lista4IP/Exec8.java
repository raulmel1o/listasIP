import java.util.ArrayList;

//finalizado

public class Exec8 {
    public static void uni (int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    res.add(arr2[j]);
                }
            }
        }

        for (int k = 0; k < res.size(); k++) {
            System.out.print(res.get(k) + " ");
        }
    }
    public static void main (String[] args) {
        int[] v1 = {1,2,4,8,16,32};
        int[] v2 = {1,4,7,10,13,16};

        uni(v1,v2);
    }
}