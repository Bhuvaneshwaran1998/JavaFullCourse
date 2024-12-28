package array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        int[] numbers = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] words = {"apple","ball","cat","dog"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        for (int i=words.length-1; i>=0; i--) {
            System.out.println(words[i]);
        }

        for (int i = 0; i < words.length; i++) {
            if(words[i].startsWith("ap") || words[i].startsWith("ca")){
                System.out.println("Conditions check");
            }else
                System.out.println("condition working fine");
        }
    }
}
