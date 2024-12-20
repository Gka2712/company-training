import java.util.*;
public class Qu53{
    public static void main(String[] args){
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(10);
        ar.add(100);
        ar.add(200);
        for(Iterator<Integer> it=ar.iterator();it.hasNext();){
            int num=it.next();
            System.out.println(num);
        }
    }
}