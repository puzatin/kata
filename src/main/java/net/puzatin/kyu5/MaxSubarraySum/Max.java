package net.puzatin.kyu5.MaxSubarraySum;

// the task: https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

public class Max {
    public static int sequence(int[] arr) {

        int current = 0;
        int max = 0;
        for (int i : arr) {
            current = Math.max(0, current + i);
            max = Math.max(max, current);
        }
        return max;
    }
}
