//finalizado

public class Exec17 {
    public static int[] inv(int[] arr){
        
        for (int i = 1; i < arr.length; i++){
            int first = arr[i - 1];
            int last = arr[arr.length - i];

            arr[i - 1] = last;
            arr[arr.length - i] = first;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] test = {1, 4, 5, 8};

        int[] res = inv(test);

        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}