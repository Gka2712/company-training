public class sample{
    public static void main(String[] args){
        int[] array={10,20,30,40,50};
        array[2]=array[4];
        array[4]=90;
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}