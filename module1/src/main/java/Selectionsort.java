public class Selectionsort {
    public static void ssort(int[] arr,int n){

        for (int i = 0; i < n - 1; i++)
        {
            int temp = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[temp]){
                    temp = j;
                }
            }
            int t = arr[temp];
            arr[temp] = arr[i];
            arr[i] = t;
        }
        System.out.println("Sorted array:");
        for (int j=0; j<n; j++) {
            System.out.print(arr[j]+ " ");
        }
    }
}
