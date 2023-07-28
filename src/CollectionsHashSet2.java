import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsHashSet2 {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>(); //Não garante a ordem de inserção
        //Set<String> listaAprovados = new TreeSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); //Classifica Lindão
        listaAprovados.add("Carla");
        listaAprovados.add("Bruno");
        listaAprovados.add("Daniel");
        listaAprovados.add("Antonio");

        for ( String candidato : listaAprovados ) {
            System.out.println(candidato);
        }

        System.out.println("Inteiros");

        Set<Integer> nums = new HashSet<>();
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(4);

        for (int numero : nums ) {
            System.out.println(numero);
        }
    }
}
