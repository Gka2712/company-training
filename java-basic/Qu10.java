public class Qu10{
    public static void main(String[] args){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        try{
            System.out.println("1を入力していただくとYes,2を入力していただくとNoを表示します");
            String line=scanner.nextLine();
            int input=Integer.parseInt(line);
            if(input==1){
                System.out.println("Yes");
            }
            else if(input==2){
                System.out.println("No");
            }
            else{
                System.out.println("1か2かで入力してください");
            }
        }catch(NumberFormatException e){
            System.out.println("正しい値で入力してください");
        }
            
    }
}