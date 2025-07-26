class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i=0;i<4;i++){

            if(isEqual(mat,target)) return true;

            mat=rotate(mat);
        }

        return false;
    }

    public static boolean isEqual(int[][] rot,int[][] target){
        for(int i=0;i<rot.length;i++){
            for(int j=0;j<rot[0].length;j++){

                if(rot[i][j]!=target[i][j]) return false;
            }
        }

        return true;
    }

    public static int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][] res=new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res[j][n-i-1]=mat[i][j];
            }
        }

        return res;
    }
}