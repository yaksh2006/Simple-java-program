package searchingpackage;
import java.util.*;

public class binarySearch {
    static void Search(int nums[], int k) {
        int left = 0;
        int right = nums.length-1;
        boolean isfound = false;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] == k) {
                isfound = true;
                break;
            }
            if(k > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(isfound) {
            System.out.println("Search Successful");
        } else {
            System.out.println("Search  Unsuccessful");
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        Search(nums,k);
        in.close();
    }
}