/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

 //Done: need to implement hashmap to reduce the time complexity from n^2

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int number;
        int arr [] = new int [2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j!=i){
                    number = nums[i]+nums[j];
                    if(number == target){
                    arr [0] = i;
                    arr [1] = j;
                    }
                }
            }
        }
        return arr;
    }
}

//improve the time complexity to O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
}