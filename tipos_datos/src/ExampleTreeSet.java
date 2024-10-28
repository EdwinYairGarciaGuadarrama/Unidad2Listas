import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    
    public static void main(String[]args){
        Set<Integer> numbers=new TreeSet<Integer>();
        numbers.add(120);
        numbers.add(10);
        numbers.add(20);
        numbers.add(100);
        numbers.add(50);
        numbers.add(80);
        System.out.println(numbers);
        for (Integer integer : numbers) {
            System.out.println(integer);
        }
        boolean exist=numbers.contains(100);
        System.out.println("contiene numero 100?"+exist);
        numbers.remove(80);
        System.out.println("tras borrar numero 80"+numbers);
    }
}
//------------------------------------------------
