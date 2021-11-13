package String;

public class RotationOfecah {

    public boolean rotataeCheck (String S1 , String S2){
       return (S1.length()==S2.length()) && ((S1+S2).indexOf(S2)!=-1);
    }
    public static void main(String[] args) {
        // Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1? 
        // (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
        
              String S1 = "ABCD" , S2 = "CDAB";
        RotationOfecah ll = new RotationOfecah();
        System.out.println(ll.rotataeCheck(S1, S2));

    }
}
