package com.lyh.offer;

/**  789123456
 * Created by lvyanghui
 * 2021/8/17 21:12
 */
public class Eight {

    public static int minInReversingList(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            int mid = (low + high) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static int minInReversingList1(int[] nums){
        if(nums == null || nums.length == 0){
            return -1;
        }

        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            //int mid = low + (high - low) / 2;
            int mid = (low + high) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else if(nums[mid] == nums[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        //int[] nums ={7,8,9,1,2,3,4,5,6};
        //int[] nums = {3,4,5,1,2};
        int[] nums = {1,1,1,0,1};
        System.out.println(minInReversingList(nums));
    }
}
