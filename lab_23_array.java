package labexam;
import java.util.*;

public class lab_23_array {

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        Arrays.sort(nums);
        int count1=1;
        int lcount=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    count1++;
                }
                else{
                    if(count1>lcount){
                        lcount=count1;
                    }
                    count1=1;
                }
            }
        }

        System.out.println(lcount);
    }
}
