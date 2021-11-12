package String;

public class Reverse {
    public String rev (String S){
        String ans ="";
        String [] Str = S.split("\\.");
      
        
        for(int i=Str.length-1;i>=0;i--){
            ans = ans+Str[i];
            ans = (i>0)?(ans+"."):ans;
        }
        return ans ;
    }
    public static void main(String[] args) {
        //  Input:
        // S = i.like.this.program.very.much
        // Output: much.very.program.this.like.i
        // Explanation: After reversing the whole
        // string(not individual words), the input
        // string becomes
        // much.very.program.this.like.i
        

        String S = "i.like.this.program.very.much";
        Reverse re = new Reverse();
        System.out.println(re.rev(S));
    }

}
