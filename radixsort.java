package sorting;

public class radixsort {
    static void displayarr(int[] arr){
        for(int val:arr){
            System.out.print(val +" ");
        }
    }

    static int findmax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static void countsort(int [] arr, int place){
        int max=findmax(arr);
        int[] count=new int[10];//single digits at place
        //make frequency array
        for(int i=0; i<arr.length; i++){
            count[(arr[i]/place)%10]++;
        }
        //make prefix sum
        for(int i=1; i<count.length;i++){
            count[i]+=count[i-1];
        }
        //output array
        int n=arr.length;
        int[] output=new int[n];
        for(int i=n-1; i>=0; i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
// copy all element of output to array
        for(int i=0; i<n; i++){
            arr[i]=output[i];
        }
    }
    
    static void radix(int[] arr){
    int max=findmax(arr);
    for(int place=1; max/place>0;place*=10){
        countsort(arr, place);
    }
    }

    public static void main(String[] args) {
       int [] arr= {142,90,0,7,545,42,77}; 
       radix(arr);
       displayarr(arr);
    }
}
