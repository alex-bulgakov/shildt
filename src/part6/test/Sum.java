package part6.test;

/**
 * Created by alebul on 13.11.16.
 */
public class Sum {
    static int sum(int ... nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(-5, 5));
        System.out.println(sum(-2, -1));
    }
}
