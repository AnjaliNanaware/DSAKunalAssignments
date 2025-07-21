// 11. [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/)
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int cnt=0;
        for(List<String> item : items){

            if(ruleKey.equals("type") && item.get(0).equals(ruleValue)) cnt++;

            else if(ruleKey.equals("color") && item.get(1).equals(ruleValue)) cnt++;


            else if(ruleKey.equals("name") && item.get(2).equals(ruleValue)) cnt++;




        }

        return cnt;
    }
}