// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void cycleSort(int[] nums){
            int i=0;
            while(i < nums.length){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i , correct);
                } else {
                   i++; 
                }
            }
        }
   
    public static void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
