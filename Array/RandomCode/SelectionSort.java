package Array.RandomCode;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 8, 9, 5, 1 };

        for (int i = 0; i < arr.length; i++) {//Dependency here so time complexity O(n2)
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println( );
    }

}
