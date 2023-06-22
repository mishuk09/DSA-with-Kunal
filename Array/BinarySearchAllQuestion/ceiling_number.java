package Array.BinarySearchAllQuestion;

public class ceiling_number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9 };
        int target = 3;
        int result = Ceiling_number(arr, target);
        System.out.println(result);

    }

    static int Ceiling_number(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return start;
    }

}
