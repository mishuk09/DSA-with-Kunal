package Array.RandomCode;

public class Selection {
    public static void main(String[] args) {
        int arr[]={7,68,54,53,1,2,8};
       int result= selsectionsort(arr);
    }

    private static int selsectionsort(int[] arr) {
        return 0;
    }

    static int selsectionsort(arr[]){
        for (int i = 0; i < arr.length; i++) {
           int index=i;
           for (int j = 0; j < arr.length; j++) {
            if(arr[j]<arr[index]){
                index=j;
            }
           }

           int temp=arr[index];
           arr[index]=arr[i];
           arr[i]=temp;

        }

    }
    
}
