package Algorithum1.Binary;

public class FirstBadV {
    public static boolean isBadversion(int n){
        int nums[] = {4,5,6,7,8,9};
         for(int i=0;i<nums.length;i++){
             if(nums[i]==n){
                 return true;
             }
         }

        return false;
     
        }
    static int version (int n){
         int i = 1;
         int j = n;
         
         while(i<j){
             int mid = i+(j-i)/2;
             if(isBadversion(mid)){
                   j = mid;
             }else{
                 i = mid+1;
             }
         }

        return i;
    }
    
    public static void main(String[] args) {
        int n = 7;
       System.out.println( FirstBadV.version(n));
    }
}
