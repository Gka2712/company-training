public class Qu10{
    public static void main(String[] args){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        try{
            System.out.println("1����͂��Ă���������Yes,2����͂��Ă���������No��\�����܂�");
            String line=scanner.nextLine();
            int input=Integer.parseInt(line);
            if(input==1){
                System.out.println("Yes");
            }
            else if(input==2){
                System.out.println("No");
            }
            else{
                System.out.println("1��2���œ��͂��Ă�������");
            }
        }catch(NumberFormatException e){
            System.out.println("�������l�œ��͂��Ă�������");
        }
            
    }
}