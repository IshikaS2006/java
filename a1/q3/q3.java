package q3;

public class q3 {
  int primeCount(int n) {
    int primeCount = 0;
    for (int i = 0; i <= n; i++) {
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        primeCount++;
      }
    }
    return primeCount;
  }
}
