public class Bubblesort {
    static void bsort(int[] arr,int n) {
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Sorted array:");
        for (int j=0; j<n; j++) {
            System.out.print(arr[j]+ " ");
        }

    }

}
