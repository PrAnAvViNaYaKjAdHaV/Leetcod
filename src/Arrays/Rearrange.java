package Arrays;

import java.util.Arrays;

public class Rearrange {
    public static void rev (int [] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
         
            if(arr[i]<0){
                if(i!=j){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,6,-2,-6};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
