
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1 ){

            if(set.contains(n)) return false;

            set.add(n);
            n=sumOfSquareOfDigits(n);
        

        }

        return true;
    }

    public static int sumOfSquareOfDigits(int num){


        int sum=0;

        while(num>0){
            sum+=Math.pow((num%10),2);

            num=num/10;
        }

        return sum;
    }
}

//You will eventually encounter same number again if it is not happy number and the reason behind this is : 
// The sum gets smaller each time 
// The number of possible outcomes is finite (possible outcomes are in specific range )
// Eventually, you’ll either hit 1 or see a number again → which means a loop