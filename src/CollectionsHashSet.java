import java.util.HashSet;
import java.util.Set;

public class CollectionsHashSet {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");  // duplicado é ignorado
        conjunto.add("x");      // duplicado é ignorado

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("x"));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);  // União entre dois conjuntos

        conjunto.retainAll(nums);
        System.out.println("Intercecção: " + conjunto);

        System.out.println(conjunto);

        //conjunto.clear(); // limpar
    }
}
