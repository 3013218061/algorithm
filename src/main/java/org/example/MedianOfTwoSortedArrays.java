package org.example;

/**
 * @description:
 * @author: shangjinyu
 * @create: 2021-05-26 14:28
 **/
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int l = 0, r = m;
        int median1 = 0, median2 = 0;
        while ( l <= r ){
            int i = (l + r) / 2, j = (m + n + 1) / 2 - i;
            int value_im1 = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int value_i = i == m ? Integer.MAX_VALUE : nums1[i];
            int valuei_jm1 = j == 0 ? Integer.MIN_VALUE : nums2[j -1];
            int value_j = j == n ? Integer.MAX_VALUE : nums2[j];
            if(value_im1 <= value_j){
                median1 = Math.max(value_im1,valuei_jm1);
                median2 = Math.min(value_i,value_j);
                l = i + 1;
            }else {
                r = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (median1 + median2) / 2.0 : median1;
    }

    public static void main(String[] args) {
        System.out.println(
                new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{2},new int[]{}));
    }
}
