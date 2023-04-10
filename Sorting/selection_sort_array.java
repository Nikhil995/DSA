package Sorting;
import java.util.*;

public class selection_sort_array {
    static int[] sorting(int[] arr){
        int min;
        int temp;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=1+i;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;

                }

            }
            temp=arr[min];
            
            arr[min]=arr[i];
            arr[i]=temp;


        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,6,4,7,20};
        sorting(arr);
    }
    
}
