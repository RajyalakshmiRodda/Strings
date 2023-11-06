import java.util.*;
public class Rev_str {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String s=sc.next();
    String reverse="";
    for (int i=s.length()-1;i>=0;i--){
      char c=s.charAt(i);
      reverse+=c;
    }
    System.out.println("reverse the string");
    System.out.println(reverse);
  }
}