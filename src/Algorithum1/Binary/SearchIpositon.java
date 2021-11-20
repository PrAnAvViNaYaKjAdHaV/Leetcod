package Algorithum1.Binary;

public class SearchIpositon {
    public static int postion (int [] nums , int target){
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
        return i;
    }
    public static void main(String[] args) {
         int nums[] = {1,3,4,5};
         int target = 6;
        System.out.println(  SearchIpositon.postion(nums, target));
          
      
    }
}
