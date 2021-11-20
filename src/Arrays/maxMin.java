package Arrays;

import java.util.Arrays;

public class maxMin {
    public int[] MaxMin(int arr[]){
        int max = 0;
        int min = 0;
          for(int i=0;i<arr.length;i++){
              if(max<arr[i]){
                  max = arr[i];
              }
              if(min>arr[i]){
                  min = arr[i];
              }
          }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int arr[] = {8,0,10,49};
        maxMin ll = new maxMin();
        System.out.println(Arrays.toString(ll.MaxMin(arr)));
        int ans[] = {4,5,6,7,8,32,90};
        
        System.out.println(Arrays.toString(minTest(ans)));
    }

    public static int[] minTest(int ans[]){
        int max =ans[0];
        int min =ans[0];
        for(int i=1;i<ans.length;i++){
          if(ans[i]>max){
              max = ans[i];
          }
          if(min>ans[i]){
             min = ans[i];
          }
        }
        return new int[]{max,min};
    }
}
