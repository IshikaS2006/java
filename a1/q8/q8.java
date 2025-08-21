package q8;

public class q8 {
  String pattern1(int n) {
      if (n==1) {
        return "1";
      }
      else{
        return ( n + " " + pattern1(n-1));
      }
    }
}

