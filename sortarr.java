package sorting;

public class sortarr {
    static void sortarr1(int[] num){
        //process
        int n=num.length;
        if(n<=1)return;
        int x=-1,y=-1;
        for(int i=1; i<n; i++){
    
            if(num[i-1]>num[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }else{
                    y=i;
                }
                }
            }
        

        //swap
        int temp= num[x];
        num[x]=num[y];
        num[y]=temp;
    }
    


    public static void main(String[] args) {
        int[] num={10,5,6,7,8,9,3};
        sortarr1(num);
        for(int val:num){
            System.out.println(val +" ");
        }
        
    }
    
}
