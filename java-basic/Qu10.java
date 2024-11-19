public class Qu10{
    public static void main(String[] args){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        try{
            System.out.println("1‚ğ“ü—Í‚µ‚Ä‚¢‚½‚¾‚­‚ÆYes,2‚ğ“ü—Í‚µ‚Ä‚¢‚½‚¾‚­‚ÆNo‚ğ•\¦‚µ‚Ü‚·");
            String line=scanner.nextLine();
            int input=Integer.parseInt(line);
            if(input==1){
                System.out.println("Yes");
            }
            else if(input==2){
                System.out.println("No");
            }
            else{
                System.out.println("1‚©2‚©‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
            }
        }catch(NumberFormatException e){
            System.out.println("³‚µ‚¢’l‚Å“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        }
            
    }
}