import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[]args){
        Set<String> frutas=new HashSet<>();
        frutas.add("banana");
        frutas.add("fresa");
        frutas.add("manzana");
        frutas.add("mango");
        frutas.add("fresa");
        frutas.add("tomate");
        frutas.add("guanavana");
        frutas.add("pera");
        frutas.add("sandia");
        System.out.println("las frutas son"+frutas);
        for (String string : frutas) {
            System.out.println(string);
        }
        boolean exist=frutas.contains("uva");
        System.out.println("existe la uva? "+exist);
        frutas.remove("pera");
        for (String string : frutas) {
            System.out.println(string);
        }
    }
}
//------------------------------------------------