package sorting;

public class selection{
    static void select(int [] arr){
        int n =arr.length;
        for(int i=0; i<n-1; i++){   //i represent current index


            //find the min element in unsorted part of the array
            int min_index=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
                
            }
            //swap the found min element with the current element
                 int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
        }
    }

    
    
    public static void main(String[] args) {
        int[] arr= {2,3,5,4,1};
        select(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        
    }
    
}
