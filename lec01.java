public class lec01 {
    public static void main(String[] args) {
        int n = Math.min(arr1.length, arr2.length);
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
        result[i] = arr1[i] + arr2[i];
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
