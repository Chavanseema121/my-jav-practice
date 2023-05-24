public class search {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.contains("e")); 
        //Check string actual match 
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.substring(1, 3));
        System.out.println(s1.replace("e", "o"));
        System.out.println(s1.replaceAll("l", "o"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        int i = 10;
        System.out.println(Integer.toString(i));
        String j = "10";
        System.out.println(Integer.parseInt(j));
        int k = Integer.parseInt(j);
        System.out.println(k + 100);
        String s2 = "Shakul, Malik, HeroVired";
        String[] s3 = s2.split(",");
        System.out.println(s3);
        
    }

    }
    

