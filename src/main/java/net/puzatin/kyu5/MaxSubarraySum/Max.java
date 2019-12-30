package net.puzatin.kyu5.MaxSubarraySum;

public class Max {
    public static int sequence(int[] arr) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int submax = 0;
            int sum = 0;
            for (int j = count; j < arr.length; j++){
                sum += arr[j];
                if (sum > submax) submax = sum;
            }
            if(submax > max) max = submax;
            count++;
        }
        return max;
    }
}
