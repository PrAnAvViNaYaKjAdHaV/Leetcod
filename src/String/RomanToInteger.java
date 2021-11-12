package String;
import java.util.*;
public class RomanToInteger {
    public int romanToDecimal(String str) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int sum = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='V'|| str.charAt(i)=='X'){
                if(i>0 && str.charAt(i-1)=='I'){
                    sum-=2;
                }
            } else if(str.charAt(i)=='L' || str.charAt(i)=='C'){
               if(i>0&&str.charAt(i-1)=='X'){
                   sum=sum-20;
               }
           }else if(str.charAt(i)=='D' || str.charAt(i)=='M'){
                if(i>0 && str.charAt(i-1)=='C'){
                    sum-=200;
                }
            }
            sum=sum+map.get(str.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        // Input:
        // s = V
        // Output: 5
        
        String str = "V";
        RomanToInteger ro = new RomanToInteger();
        System.out.println("This is conversion Roman to Integer "+ro.romanToDecimal(str));

    }
}
