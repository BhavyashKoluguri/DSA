// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,2,2,2,3,4,4,5,5,5,6,7,7};
        int ans = -1;
        int target = 3;
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int mid = start + (end-start) / 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            } else {
                ans = mid; //potential ans;
                end = mid;
            }
        }
        System.out.println(ans);
    }
}