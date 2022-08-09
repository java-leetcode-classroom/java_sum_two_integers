public class Solution {
  public int getSum(int a, int b) {
    int sum = a, carry = b;
    while(carry != 0) {
      int temp = (sum&carry) << 1;
      sum = (sum^carry);
      carry = temp;
    }
    return sum;
  }
}
