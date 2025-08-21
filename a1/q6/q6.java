package q6;

public class q6 {
  boolean checkLeapYear(int year){
    boolean isLeapYear = false;
    if (year % 4==0){
      isLeapYear = true;
    }
    return isLeapYear;
  }
}
