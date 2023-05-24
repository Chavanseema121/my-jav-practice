public class string2 {
    public static void main(String[] args) {
        String s1 = "this is my first code in java";
        String[] arstr=s1.split(" ");
        System.out.println(arstr.length);
        int Counts1 = s1.split("\\s").length;
        System.out.println(Counts1);
        System.out.println("Number of char:" + s1.length());
    }
    
}
