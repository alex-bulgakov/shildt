package part5;

/**
 * Created by alebul on 10.11.16.
 */
public class Bubble {
    public static void main(String[] args) {
        int[] nums = {100, 34, -3, 23, -34, 94, 20, -32};

        int a, b, t;
        int size = nums.length;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if(nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }
}
