package q7;

public class q7 {
  boolean isArmstrong(int num) {
    int originalNum = num;
    int sum = 0;
    int a=0;
    int length = String.valueOf(num).length();
    for (int i = length; i > 0; i--) {
      a = num / (int)Math.pow(10, i-1);
      sum += a * a * a;
      num -= a * (int)Math.pow(10, i-1);
  }
  if (sum == originalNum) {
    return true;
  }
  return false;
}
}
