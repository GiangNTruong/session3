public class Max2 {
    public static void main(String[] args) {
        int[] arr = {35, 35, 30,30, 10, 15, 20, 25, 30 ,35};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                max2 = max;
                max = j;
            } else if (j > max2 && j != max) {
                max2 = j;
            }
        }

        System.out.println("Số lớn thứ hai trong mảng là: " + max2);






    }
}
