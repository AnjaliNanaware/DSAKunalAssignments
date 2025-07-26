/**
 * Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 
 */



class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sum=new StringBuilder();
        int carry=0;

        int i=a.length()-1;
        int j=b.length()-1;

        while(i>=0 || j>=0 || carry==1){

            if(i >= 0){
                carry+=a.charAt(i)-'0'; // IT will convert char into integer 
                i--;
            }

            if(j>=0){
                carry+=b.charAt(j)-'0';
                j--;
            }

            // if we add binary 1 and 1 --> it will give 2 
            //(in binary 1 0  so we keep 0 and carry will be 1 ) that's why we did % 2 here 
            sum.append(carry % 2);  
            carry /= 2;
        }

        return sum.reverse().toString();
    }
}