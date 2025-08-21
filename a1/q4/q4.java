package q4;

public class q4 {
  int factorial(int n){

    int ans = 0;
    if (n==0 || n==1){
      return 1;
    }
    ans = n*factorial(n-1);
    return ans;
  }
}
