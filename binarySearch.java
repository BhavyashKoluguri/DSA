// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }
    public static int binarySearch(int[] arr1, int key){
        int start = 0;
        int end = arr1.length - 1;
        
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(key > arr1[mid]){
                start = mid + 1;
            }
            else if(key < arr1[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}