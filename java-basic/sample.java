import java.util.*;
public class sample{
    public static void main(String[] args){
        ArrayList<String> array=new ArrayList<String>();       
        array.add("山田"+30+"歳");
        array.add("鈴木"+50+"歳");
        for(Iterator<String> it=array.iterator();it.hasNext();){
            String name=it.next();
            name=it.next();
            System.out.print(name);
        }
    }
}