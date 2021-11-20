package Algorithum1.Binary;

public class BinarySearch {
    public static  int  search (int []nums ,int target){
         int i = 0;
         int j = nums.length-1;
         
         while(i<=j){
             int mid = i+(j-i)/2;

             if(nums[mid]==target){
                 return mid;
             }else if(nums[mid]>target){
                  j = mid-1;
             }else{
                 i = mid+1;
             }
         }


        return 0;
    }

     public static void main(String[] args) {
          int [] nums = {1,5,6,7,8,9};
          int target = 9;
         System.out.println( BinarySearch.search(nums,target));
     }
}
