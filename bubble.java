package sorting;

public class bubble {
    static void bubblesort(int []arr){
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            boolean flag=false;
        for(int j=0; j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
            if(flag==false){
            return;
        }
        
        }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,1,0,2,4,6,5,7};
        bubblesort(arr);
        for(int i:arr){
            System.out.print(i +" ");
        }

    }
    
}
