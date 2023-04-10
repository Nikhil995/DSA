package Sorting;
import java.util.*;

public class bubble_sort_array {
    static int[] sorting(int[] arr){
        boolean f=false;
        for(int i=0;i<arr.length-1;i++){
            f=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    f=true;
                }
            }
            if(f==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr=new int[]{5,2,8,6,9};
        sorting(arr);
    }
}
