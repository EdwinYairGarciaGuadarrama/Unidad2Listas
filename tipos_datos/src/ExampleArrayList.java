import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ExampleArrayList {
    public static void main(String[]args){
        List<String> frutas=new ArrayList<>();//method with <> is an arrow function
        frutas.add("banana");
        frutas.add("fresa");
        frutas.add("manzana");
        frutas.add("mango");
        System.out.println("las frutas son"+frutas);
        for (String fruit : frutas) {
            System.out.println("Fruta:"+fruit);
        }
        frutas.add("sandia");
        System.out.println("frutas despues de agregar "+frutas);
        String fruta2=frutas.get(2);
        System.out.println("la fruta seleccionada es "+fruta2);

        frutas.remove(1);
        frutas.remove("mango");
        System.out.println(frutas);

        List<String> verduras=new LinkedList<>();
        verduras.add("pepino");
        verduras.add("brocoli");
        verduras.add("zanahoria");
        verduras.add("calabaza");
        System.out.println(verduras);
        System.out.println("verdura en index 1 "+verduras.get(1));
        verduras.add(2, "cebolla");
        System.out.println("tras añadir cebolla en index 2"+verduras);
        verduras.remove(verduras.size()-1);
        System.out.println("tras remover ultimo index "+verduras);
    }
}
//----------------------------------------------