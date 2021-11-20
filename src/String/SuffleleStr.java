package String;

/**
 * SuffleleStr
 */
public class SuffleleStr {
    public boolean sheffle (String F , String S,String result){
           String add = F+S+F+S+F+S+F;
           
            if(add.contains(result)){
                return true;
            }

        return false;
    }

    public static void main(String[] args) {

        String first = "XY";
        String second = "12";
        String results = "X12Y";
    
        // call the method to check if result string is
        // shuffle of the string first and second
        SuffleleStr ll = new SuffleleStr();
        boolean check = ll.sheffle(first, second, results);
        System.out.println(check);
    }  
}