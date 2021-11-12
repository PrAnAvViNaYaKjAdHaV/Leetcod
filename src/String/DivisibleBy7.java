package String;

public class DivisibleBy7 {
    int isdivisible7(String num){
        java.math.BigInteger bi =new java.math.BigInteger(num);
        bi=bi.mod(java.math.BigInteger.valueOf(7));
        if(bi.intValue()==0)
        return 1;
        return 0;
    }
    public static void main(String[] args) {
       
            String  num = "8955795758";
            DivisibleBy7 l = new DivisibleBy7();
             int ans = l.isdivisible7(num);
             System.out.println(ans);
        
    }
}
