package String;

/**
 * PlindromStr
 */
public class PlindromStr {
    int isPalindrome(String S) {
      
        int i = 0;
        int j = S.length()-1;
        boolean check = false;
       
        for(int k = 0;k<=S.length()/2;k++){
            if(S.charAt(i)==S.charAt(j)){
                check = true;
                i++;
                j--;
            }else{
                check = false;
            }
        }
         if(check){
             return 1;
         }
         
         return 0;
      }
    public static void main(String[] args) {
        // Input: S = "abba"
        // Output: 1
        // Explanation: S is a palindrome

        String S = "aba";
    PlindromStr l = new PlindromStr();
        System.out.println(l.isPalindrome(S));
    }
}