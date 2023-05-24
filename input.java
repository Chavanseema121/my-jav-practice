import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        
    
        Scanner s  = new Scanner (System.in);
        // System.out.println("Enter Your name:");
        // String name = s.nextLine(); //nextlIne is reading your string
        // // System.out.println(name);
        // System.out.println("Enter your age");
        // int age = s.nextInt();
        // if(age >= 18){
        //     System.out.println("You are able to vote");
        // }else{
        //     System.out.println("You are not able to vote");
        // }
        // s.nextLine(); //blank next line is use for 
        // System.out.println("Enter Your hobbies");
        // String hobby = s.nextLine();
        // System.out.println("Enter Your contact us:");
        // long number = s.nextInt();
int score = 0;
        System.out.println("Enter capital of India:");
        String abc= s.nextLine();
        String p = abc.toLowerCase();
        // System.out.println("You are able to vote "  + p);
        if(p.equals("delhi")  ){
            score++;
            System.out.println("correct ans " + p);
            
        }
        else{
            
            System.out.println("wrong ans " + p);
            score--;

        }

        System.out.println("Enter national animal of India:");
        String agl= s.nextLine();
        String b = agl.toLowerCase();

        // String p = abc.toLowerCase()
        // System.out.println("You are able to vote "  + p);
        if(b.equals("tiger")  ){
            score++;
            System.out.println("correct ans " + b);
            
        }
        else{
            
            System.out.println("wrong ans " + b);
            score--;

        }
        System.out.println(score);
        s.close();
    }

}
    
    

