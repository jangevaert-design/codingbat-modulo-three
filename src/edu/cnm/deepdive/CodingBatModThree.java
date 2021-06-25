package edu.cnm.deepdive;

/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
 */

public class CodingBatModThree {

  private static int[] one = {2, 1, 3, 5};
  private static int[] two = {2, 1, 2, 5};
  private static int[] three = {2, 4, 2, 5};

  public static void main(String[] args) {
    System.out.println("With the array [2, 1, 3, 5], the outcome is " + modThree(one) + ".");
    System.out.println("With the array [2, 1, 2, 5], the outcome is " + modThree(two) + ".");
    System.out.println("With the array [2, 4, 2, 5], the outcome is " + modThree(three) + ".");
  }

  public static boolean modThree(int[] nums) {

    for (int i = 0; i < nums.length -2; i++) {
      if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
        return true;
      }
      if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
        return true;
      }
    }
    return false;
  }

}
