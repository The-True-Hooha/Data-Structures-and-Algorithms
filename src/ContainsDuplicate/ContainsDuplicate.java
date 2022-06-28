package ContainsDuplicate;

// question is tagged leetcode easy

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.  Leetcode 217/2322

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> doesNotContain = new HashSet<>();
        for (int number : nums){
            if (!doesNotContain.add(number)){
                return true;
            }
        }
        return false;
    }
}

/*
Thoughts:
I initially tried to use ArrayList to store the numbers,
and then make find if it contains a duplicates to return true.
Code compiled successfully but, I failed the submission on leetcode.

I now remembered you have HashTables (where you use HashSet to find if (in this case)
a set contains a duplicate value or not.

Passed the submission !!
 */