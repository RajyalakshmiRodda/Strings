public class Meth_str {
    public static void main(String[] args) {
        String s="rajyalakshmi";
        String r="hello";
        System.out.println("length of the string "+s.length());
        System.out.println(s.indexOf('m'));
        System.out.println(r.charAt(3));
        System.out.println(s.equals(r));
        System.out.println(s.toUpperCase());
        System.out.println(r.toLowerCase());
        System.out.println(s.hashCode());
        System.out.println(r.hashCode());
        System.out.println(s.contains("rajyalakshmi"));
        System.out.println(r.startsWith("h"));
        System.out.println(s.isEmpty());
        System.out.println(r.substring(0));
        System.out.println(s.compareTo(r));
    }
}
