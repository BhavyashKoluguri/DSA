// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        boolean flag;
        int[] arr = {2,0,2,1,1,0};
        int n = arr.length;
        for(int i=0; i<n; i++){
            flag = false;
            for(int j=1; j<n-i; j++){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
