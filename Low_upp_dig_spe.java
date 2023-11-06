public class Low_upp_dig_spe {
  public static void main(String[]args){
    String s="Welcometo1345_&$JAva";
    int upper=0,lower=0,digit=0,special=0;
    for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
      if(c>='A'&&c<='Z')
        upper++;
        else if(c>='a'&&c<='z')
        lower++;
         else if(c>='0'&&c<='9')
        digit++;
       else
         special++;
    }
    System.out.println("upper case are");
    System.out.println(upper);
    System.out.println("lower case are");
    System.out.println(lower);
    System.out.println("digits are");
    System.out.println(digit);
    System.out.println("special symbols are");
    System.out.println(special);
  }
}
