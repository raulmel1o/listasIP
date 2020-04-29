
public class Exec11 {
    public static int[] cases(int[] arr) {
        int[] res = new int[6];
        
        for (int i : arr) {
            switch (i) {
                case 1: res[0] += 1;
                break;
                case 2: res[1] += 1;
                break;
                case 3: res[2] += 1;
                break;
                case 4: res[3] += 1;
                break;
                case 5: res[4] += 1;
                break;
                case 6: res[5] += 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num = { 1, 1, 1, 4, 4, 2, 3, 1, 6, 5, 6};

        int[] res = cases(num);

        for (int i : res) {
            System.out.println(i);
        }
    }
}