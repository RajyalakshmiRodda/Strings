public class Stmt_con {
    public static void main(String[] args) {
        String str="welcome to java";
        String[] s= str.split(" ");
        StringBuilder r=new StringBuilder();
        for (String s1:s) {
            StringBuilder r1= new StringBuilder(s1);
            r1.reverse();
            r.append(r1).append(" ");
        }
        System.out.println("Original Statement");
      System.out.println(str);
      System.out.println("Reversed Statement"); 
     System.out.println(r.toString().trim());
    }
}