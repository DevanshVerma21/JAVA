import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

    public static void mergearr(int m,int nums1[],int n,int nums2[]){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String args[]) {
        
        

        for (int i = 0; i < (m + n); i++) {
            System.out.println("The merged sorted array: " + nums1[i]);
        }

    }
}
