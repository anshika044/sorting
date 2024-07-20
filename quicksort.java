package sorting;

public class quicksort {

    static void displayarr(int[] arr){
        for(int val:arr){
            System.out.println(val +" ");
        }
    }

    static void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    
    static int partition(int[]arr,int start, int end){
    int pivot=arr[start];
    int count=0;
    for(int i=start+1; i<=end; i++){
        if(arr[i]<=pivot){
            count++;
        }
    }
    int pivotindx=start+count;
    swap(arr, start, pivotindx);

    int i=start;
    int j=end;
    while (i<pivotindx && j>pivotindx) {
        while (arr[i]<=pivot) {
            i++;
        }
        while (arr[j]>pivot) {
            j--;
        }

        if(i<pivotindx && j>pivotindx){
            swap(arr, i, j);
            i++;
            j--;
        }
        
    }

    return pivotindx;
    

    }

    static void quicksort1(int[] arr,int start,int end){
        //base case
        if(start>=end)return;
        int pi=partition(arr, start, end);
        quicksort1(arr, start, pi-1);
        quicksort1(arr, pi+1, end);
        
    }

    public static void main(String[] args) {
        int[] arr={2,6,3,1,5,5,4};
        int n =arr.length;
        System.out.print(" array before sorting ");
        System.out.println();
        displayarr(arr);
        quicksort1(arr, 0, n-1);
        System.out.print("array after sorting ");
        System.out.println();
        displayarr(arr);
        
    }
    
}
