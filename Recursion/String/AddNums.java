// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class AddNums {
    
    public static void sumStr(String num1, String num2,int i, int j,StringBuilder ans, int carry){
        
        if(i < 0 && j<0 && carry==0){
            return;
        }
        
        int first=0;
        int second=0;
        
        if(i>=0) first=num1.charAt(i)-'0';
        if(j>=0) second=num2.charAt(j)-'0';
        
        int sum=first+second+carry;
        int lastDigit=sum%10;
        carry=sum/10;
        
        ans.append(lastDigit);
        
        sumStr(num1,num2,i-1,j-1,ans,carry);
        
    }
    
    public static void main(String[] args) {
        String first="43";
        String second="343";
        StringBuilder ans=new StringBuilder();
        sumStr(first,second,first.length()-1,second.length()-1,ans,0);
        System.out.println(ans.reverse());
    
    }
}