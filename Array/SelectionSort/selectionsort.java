package Array.SelectionSort;

public class selectionsort {
    // time complexity of this algoritham is O(n2)
    // Space complexity is O(1)

    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 2, 8, 17, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
}
