import java.util.LinkedHashSet;
import java.util.Set;
public class ExampleLinkedHashSet {
    
    public static void main(String[]args){
        Set<String> animales=new LinkedHashSet<String>();
        animales.add("perro");
        animales.add("tlacuache");
        animales.add("gorila");
        animales.add("pulpo de anillos azules");
        animales.add("zorro");
        animales.add("ardilla");
        System.out.println(animales);
        for (String string : animales) {
            System.out.println(string);
        }
        boolean exist=animales.contains("zorro");
        System.out.println("existe un zorro?"+exist);
        animales.remove("gorila");
        System.out.println("tras eliminar gorila"+animales);
    }
}
//------------------------------------------------
