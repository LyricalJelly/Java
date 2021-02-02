package partition_array_into_three_parts_with_equal_sum;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[] { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 }));
    }

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int front = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            front += arr[i];
            if (front == sum / 3) {
                break;
            }
        }
        int middle = 0;
        int j = i + 1;
        for (; j < arr.length; j++) {
            middle += arr[j];
            if (middle == sum / 3) {
                break;
            }
        }
        if (j < arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}
