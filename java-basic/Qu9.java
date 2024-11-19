public class Qu9{
    public static void main(String[] args){
        int num_1=10;
        int num_2=10;
        double num_3=10.0;
        double num_4=5.0;
        if((num_1!=num_2)||(num_1<20)){
            if((num_1!=num_2)&&(num_3<10)){
                System.out.print("Comment1");
            }
            else if(num_3*num_4<=num_2*5){
                System.out.println("Comment2");
            }
            System.out.println("Comment3");
        }else{
            System.out.println("Comment4");
        }
    }
}