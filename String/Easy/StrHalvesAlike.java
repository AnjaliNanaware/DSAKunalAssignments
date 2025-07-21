class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels="aeiouAEIOU";

        int mid=s.length()/2;
        String str1=s.substring(0,mid);
        String str2=s.substring(mid);

        int cnt1=0;
        int cnt2=0;

        for(int i=0;i<mid;i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);

            if(vowels.indexOf(c1)!=-1) cnt1++;

            if(vowels.indexOf(c2)!=-1) cnt2++;
        }

        if(cnt1==cnt2) return true;

        return false;
    }
}