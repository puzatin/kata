package net.puzatin.kyu6.dRoot;

// the task: https://www.codewars.com/kata/541c8630095125aba6000c00

public class DRoot {
    public static int digital_root(int n) {

        int sum;
      do {
          sum = 0;
          while (n > 0) {
              sum += n % 10;
              n /= 10;
          }
          n = sum;
      } while (sum > 9);

        return n;
    }

    // another solution: return (n != 0 && n%9 == 0) ? 9 : n % 9;






}
