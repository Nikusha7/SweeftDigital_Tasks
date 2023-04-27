package ge.tsu;

import java.util.HashMap;
import java.util.HashSet;

/*
Problem: გვაქვს მთელი რიცხვების ჩამონათვალი სადაც ერთის გარდა ყველა რიცხვი მეორდება,
         იპოვეთ ის რიცხვი რომელიც არ მეორდება. Int minSplit(Int amount);
 */

public class Task1 {

    //sorting and looking for single number
    public int findSingleNumber1(int[] nums) {
        int pos;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            pos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[pos]) {
                    pos = j;
                }
            }
            temp = nums[pos];
            nums[pos] = nums[i];
            nums[i] = temp;
        }

        int i = 0;
        int k = 1;
        int result = 0;
        for (int j = 1; j <= nums.length; j++) {
            if (j == nums.length && nums[i] != nums[k]) {
                result = nums[i];
            } else if (nums[i] == nums[j]) {
                i = j + 1;
                k = i - 1;
                j = i;
            } else if (nums[i] == nums[k]) {
                i = j;
                k = i - 1;
                j = i;
            } else {
                result = nums[i];
                i = j;
                k = i - 1;
            }
        }
        return result;
    }

    /*
    Using hashset: inserting numbers in hashset but if the number is already inserted in hashset then delete it from hashset
     */
    public int findSingleNumber2(int[] nums) {
        HashSet<Integer> singleNumber = new HashSet<>();

        HashSet<Integer> checkingSet = new HashSet<>();
        for (int values : nums) {
            if (checkingSet.contains(values)) {
            } else if (singleNumber.contains(values)) {
                checkingSet.add(values);
                singleNumber.remove(values);
            } else {
                singleNumber.add(values);
            }
        }
        return singleNumber.iterator().next();
    }

    /*
     Using hashmap: inserting numbers in hashmap but if the number is already inserted in hashmap then delete it from hashmap
      */
    public int findSingleNumber3(int[] nums) {
        HashMap<Integer, Integer> singleNumMap = new HashMap<>();

        for (int values : nums) {
            if (!singleNumMap.containsKey(values)) {
                singleNumMap.put(values, 1);
            } else
                singleNumMap.put(values, 2);
        }

        for (var key : singleNumMap.keySet()) {
            if (singleNumMap.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }


}
