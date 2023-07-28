import java.util.ArrayList;
import java.util.Arrays;

public class ListaUsuarios {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Bruno"));
        lista.add(new Usuario("Carla"));
        lista.add(new Usuario("Daniel"));
        lista.add(new Usuario("Elias"));

        for ( Usuario u : lista ) {
            System.out.println(u.nome);
        }

        System.out.println("");
        System.out.println("Pesquisa por índice:");
        System.out.println(lista.get(3).nome);

        System.out.println(lista.toString());

        System.out.println("");
        System.out.println("Remove Indice 0");
        lista.remove(0);
        lista.remove((new Usuario("Elias")));

        for ( Usuario u : lista ) {
            System.out.println(u.nome);
        }

        System.out.println("");
        System.out.println("* Verifica se contém Daniel?");

        System.out.println(lista.contains(new Usuario("Daniel")));

    }
}
