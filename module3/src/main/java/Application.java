import java.util.Scanner;
public class Application{
    public static void main(String[] args)
    {
        int n, i, k;
        int[] arr = new int[50];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = scan.nextInt();
        System.out.println("Enter elements of array: ");
        for(i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter 1.Selectionsort 2.Bubblesort: ");
        k = scan.nextInt();
        if(k==1)
        {
            Selectionsort.ssort(arr,n);
        }
        else if(k==2)
        {
            Bubblesort.bsort(arr,n);
        }
        
    }
}

