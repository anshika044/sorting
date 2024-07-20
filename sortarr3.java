package sorting;

public class sortarr3 {

    static void countsort(int[] num){
        int count_0=0 , count_1=0 , count_2=0;
        for(int i=0; i<num.length;i++){
            if(num[i]==0){
                count_0++;
            }
            else if(num[i]==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }

        int k=0;
        while(count_0>0){
            num[k++]=0;
            count_0--;
        }
        while(count_1>0){
            num[k++]=1;
            count_1--;
        }
        while(count_2>0){
            num[k++]=2;
            count_2--;
        }






    }
    private static void elseif() {
    }
    public static void main(String[] args) {
        int [] num={0,1,2,2,1,0,0};

        countsort(num);
        for(int val:num){
            System.out.print(val +" ");
        }
    }
    
}
