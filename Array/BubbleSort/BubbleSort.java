package Array.BubbleSort;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 7, 6, 8, 1 };

        // outer loop for define how many time code execude
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
    }

}
