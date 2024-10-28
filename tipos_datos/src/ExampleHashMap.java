
import java.util.Map;
import java.util.HashMap;

public class ExampleHashMap{

    public static void main(String[] args){
        Map<Integer,String>frutas=new HashMap<>();
        frutas.put(1,"Pera");
        frutas.put(2,"Mango");
        frutas.put(3,"Fresa");
        frutas.put(4,"Kiwi");
        frutas.put(5,"Pera");
        System.out.println("Las frutas son: "+frutas);
        frutas.forEach((key, value)->{
            System.out.println("El Key es: "+key+" value es: "+value);
        });
        String fruta1=frutas.get(5);
        System.out.println("la ultima fruta es:"+fruta1);
        frutas.remove(5);
        System.out.println("Frutas despues de eliminar la ultima: "+frutas);

    }
}