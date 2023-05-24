public class reverse {
    public static void main(String[] args) {
        String s1 = " this is my first code";
        StringBuilder reversed = new StringBuilder(s1);
        System.out.println(reversed);
        reversed.reverse();

        String output = reversed.toString();
        System.out.println(output);
    }
    
}
