14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[][] mat=new int[m][n];
        int cnt=0;

        for(int i=0;i<indices.length;i++){
            
            incrementRow(mat[indices[i][0]]);
            incrementCol(mat,indices[i][1]);
        }

        for(int[] mArr:mat){
            for(int mEle : mArr){
                if(mEle %2!=0) cnt++;
            }

        }
        return cnt;
    }

    public static void  incrementRow(int[] arr){

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }

    public static void incrementCol(int[][] arr,int ColIdx){

            for(int i=0;i<arr.length;i++){

                arr[i][ColIdx]+=1;
            }
    }
}