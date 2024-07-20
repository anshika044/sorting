package sorting;

public class sortarr012 {
    static void swap(int[] arr,int x,int y){
    int temp= arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
    }
    static void sort(int [] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        //explore the unknown region
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
           else if(arr[mid]==1){
            mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,0,0,1,1,2,0,2};
        sort(arr);
        for(int val:arr){
            System.out.println(val + " ");
        }
    }
    
}
