// 10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
class Solution {
    public boolean checkIfPangram(String sentence) {
        

        if(sentence.length()<26) return false;

        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }

        return true;
        
    }
}

// class Solution {
//     public boolean checkIfPangram(String sentence) {
        
//         int[] arr=new int[26];

//         if(sentence.length() < 26) return false;

        
//         for(int i=0;i<sentence.length();i++){
//             arr[sentence.charAt(i)-'a']++;
//         }

//         for(int i=0;i<26;i++){
//             if(arr[i]==0) return false;
//         }

//         return true;
//     }
// }