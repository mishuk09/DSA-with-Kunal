package Array.InsertionSort;

public class insertionSort {

    public static void main(String[] args) {
        int arr[] = { 5, 4, 7, 4, 6, 2, 9, 1 };
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}
