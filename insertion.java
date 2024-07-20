package sorting;

public class insertion {
    static void insertionsort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={4,3,5,2,1};
        insertionsort(arr);
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
    
}
