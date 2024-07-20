package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class bucketsort {

    static void bucket(float[] arr){
        int n=arr.length;
        //buckets
        //int[] a=new int[n]
        ArrayList<Float>[] bucket=new ArrayList[n];
        //create empty bucket
        for(int i=0; i<n; i++){
            bucket[i]=new ArrayList<Float>();
        }

        //add elements
        for(int i=0; i<n; i++){
            int bucketindex=(int) arr[i]*n;
            bucket[bucketindex].add(arr[i]);
        }

        //sort each bucket
        for(int i=0; i<bucket.length; i++){
            Collections.sort(bucket[i]);
        }
        //merge all buckets
        int index=0;
        for(int i=0; i<bucket.length;i++){
            ArrayList<Float> currbucket= bucket[i];
            for(int j=0; j<currbucket.size(); j++){
                arr[index++]=currbucket.get(j);
            }
        }



    }
   public static void main(String[] args) {
    float[] arr= {0.4f,0.5f,0.9f,0.3f,0.1f};
    bucket(arr);
    for(float val:arr){
        System.out.println(val +" ");
    }
   } 
}
