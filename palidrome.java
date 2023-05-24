public class palidrome {
    public static void main(String[] args) {
        String Str = "Madam", reverseStr = "";
        int StrLength = Str.length();
        for(int i = (StrLength-1); i>=0; i--){
            reverseStr = reverseStr + Str.CharAt(i);

        }
        if (Str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(Str + "is a palidrome:");

        }
        else{
            System.out.println(Str + "is not palidrome:");

        }


    }
    
}
