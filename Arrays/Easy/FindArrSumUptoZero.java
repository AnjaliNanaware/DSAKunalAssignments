class Solution {
    public int[] sumZero(int n) {
        List<Integer> ans=new ArrayList<>();


        if(n%2!=0){
            n=n-1;
            ans.add(0);

            for(int i=1;i*2<=n;i++){
                ans.add(i);
                ans.add(-i);
            }

        }else{
            for(int i=1;i*2<=n;i++){
                ans.add(i);
                ans.add(-i);
            }
        }

       int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}