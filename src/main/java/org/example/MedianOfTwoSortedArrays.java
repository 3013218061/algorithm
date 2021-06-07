package org.example;

import java.util.Objects;

/**
 * @description:
 * @author: shangjinyu
 * @create: 2021-05-26 14:28
 **/
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(Objects.isNull(nums1) && Objects.isNull(nums2)){
            return 0;
        }
        int i = 0;
        int j = (nums1.length + nums2.length + 1) / 2 - i;
        return 0;
    }
}
