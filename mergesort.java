package sorting;

public class mergesort {
    static void displayarr(int[] arr){
        for(int val:arr){
            System.out.println(val + " ");
        }
    }

    static void merge(int[] arr, int l, int mid, int r){
        int n1= mid-l+1; 
        int n2 =r-mid;
        int[] left=new int[n1];
        int [] right=new int[n2];
        int i,j,k;
        for( i=0; i<n1; i++){
            left[i]=arr[l+i];
        }
        for( j=0; j<n2; j++){
            right[j]=arr[mid+1+j];

        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
            arr[k]=left[i];
            k++;
            i++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }

        while(j<n2){
            arr[k++]=right[j++];
        }

    }

    static void mergesort1(int[] arr, int l,int r){
     if(l>=r){
        return;
     }
     int mid=(l+r)/2;
     mergesort1(arr,l, mid);
     mergesort1(arr, mid+1, r);
     merge(arr, l, mid, r);
     
    }


    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9};
        int n = arr.length;
        System.out.print(" array before sorting ");
        System.out.println();
        displayarr(arr);
        mergesort1(arr, 0, n-1);
        System.out.print("array after sorting ");
        System.out.println();
        displayarr(arr);
         
        
    }
    
}
