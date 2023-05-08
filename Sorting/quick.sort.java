package Sorting;
import java.util.*;

 class quick_sort {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int [] arr,int l,int h){
        int piviot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<piviot){
                i++;
                swap(arr,i,j)
;            }

        }
        swap(arr,i+1,h);
        return i+1;
    }

    static void sort(int[] arr,int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            sort(arr,l,p-1);
            sort(arr,p+1,h);
        }

    }
    public static void main(String[] args) {
        int []arr={4,5,9,2,7,6};
        int n=arr.length;
        sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
