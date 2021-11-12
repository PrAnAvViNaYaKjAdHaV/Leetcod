package String;

public class IntegerToRoman {
    String convertToRoman(int n) {
     String o[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
     String t[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
     String h[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
     String th[]={"","M","MM","MMM"};
     return th[n/1000]+h[(n%1000)/100]+t[(n%100)/10]+o[n%10];
        }
        public static void main(String[] args) {
             // 3000 is limit of this funcion as an input
            //  n = 5
            //  Output: V
             int n = 3000;
            IntegerToRoman i = new IntegerToRoman();
             System.out.println(i.convertToRoman(n));
        }
}

