package Arrays;
import java.util.*;
public class Reverse {
    public int[] rev (int [] reves){
       int ans [] = new int[reves.length];
       int j = reves.length-1;
        for(int i= 0;i<reves.length;i++){
           
            ans[j]=reves[i];
            j--;
        }
        return ans;
    }
    public void reveseArray (int arr[] , int start, int end){
          while(start<end){
               int temp = arr[start];
               arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
          }
    }
    public static void main(String[] args) {
        int reves[] = {1,2,3};
        Reverse ll =new Reverse();
        String S = Arrays.toString(ll.rev(reves));
        System.out.println(S);
       ll.reveseArray(reves, 0, reves.length-1);
       System.out.println(Arrays.toString(reves));
    }
}
