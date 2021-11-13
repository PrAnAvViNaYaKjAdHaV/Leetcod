package String;
// import java.util.*;
public class DublicateStr {
    public String dublicate (String S){
       int noFchar = 256;
       String ans = "";
       int count [] = new int[noFchar];
       for(int i= 0;i<S.length();i++){
           count[S.charAt(i)]++;
       }
       for(int i = 0;i<noFchar;i++){
           if(count[i]>1){
          ans+=(char)(i);
           }
       }
       return ans.toString();
    }
//    public String dub (String S){
//        String ans = "";
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i =0;i<S.length();i++){
//             if(!map.containsKey(S.charAt(i))){
                
//                 map.replace(S.charAt(i),0,map.get(S.charAt(i))+1);
                
//             }else{
//                 map.put(S.charAt(i),1);
//             }
//        }
//         for(Map.Entry mapElement : map.entrySet())  {
//                 int value = ((int)mapElement.getValue());
//                 char key = (char)mapElement.getKey();
//                 if(value>1){
//                     ans+=key;
//                 }
//         }
  
//        return ans;
//    }
    public static void main(String[] args) {
        String S = "abbbads";
        DublicateStr ll = new DublicateStr();
        System.out.println(ll.dublicate(S));
        // System.out.println(ll.dub(S));
    }
}
