
import java.util.Map;
import java.util.TreeMap;

public class ExampleMapTree{
    public static void main(String[]args){
        Map<Integer,String>frutas=new TreeMap<>();
        frutas.put(1,"Coco");
        frutas.put(2,"durazno");
        frutas.put(3,"arandano");
        frutas.put(4,"banana");
        System.out.println("las frutas son:"+frutas);
        frutas.forEach((key,value)->{
            System.out.println("key:"+key+" Value: "+value);
        });
        String fruta=frutas.get(1);
        System.out.println("fruta:"+fruta);
        frutas.remove(3);
        System.out.println("frutas tras remover key 3:"+frutas);

        
    }
}