package String;

public class Pangram {
    public static void main(String[] args) {
//         A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false
 


 String sentence = "thequickbrownfoxjumpsoverthelazydog";
 panagram p = new panagram();
    
       boolean ans = p.checkIfPangram(sentence);        

       System.out.println("Sentence is panagram :"+ans);
 
    }
    
}
class panagram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char i='a';i<='z';i++){
            if(sentence.indexOf(i)==-1){
             return false;
            }
        }
        return true;
    }
}