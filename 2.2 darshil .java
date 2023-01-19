public class darshil3 {

    public static void main(String[] args) {

        int nums[] = { 10, 54, 32, 58, 2, 5, 78, 64, 33 };
        int max, min;

        max = nums[0];
        min = nums[0];

        for (int i : nums) {

            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }

        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
