// package Arrays;

// 9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
import java.util.Arrays;

public class ShiftElem {


        public static int[] createTargetArray(int[] nums, int[] index) {

            int[] target=new int[nums.length];

            for(int i=0;i<target.length;i++){
                target[i]=-1;
            }

            for(int i=0;i<nums.length;i++){

                if(target[index[i]]!=-1){
                    shift(target,index[i]);
                    target[index[i]]=nums[i];
                }else{
                    target[index[i]]=nums[i];

                }
            }

            return target;
        }

        public static void shift(int[] arr, int start ){

            for(int i=arr.length-2;i>=start;i--){
                arr[i+1]=arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
            int[] nums = {0, 1, 2, 3, 4};
            int[] index = {0, 1, 2, 2, 1};

        createTargetArray(nums,index);

    }
}

