// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        -----------------------------------------------------------------------------------
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int max = findMax(arr,0,last);
            swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int findMax(int[]nums, int start, int end){
        int max = start;
        for(int x = start; x <= end; x++){
            if(nums[x] > nums[max]){
                max = x;
            }
        }
        return max;
    }
    public static void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public static void insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
}