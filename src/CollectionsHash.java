import java.util.HashSet;

public class CollectionsHash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Americo"));
        usuarios.add(new Usuario("Bernardo"));
        usuarios.add(new Usuario("Claudio"));

        boolean resultado = usuarios.contains(new Usuario("Bernardo"));
        System.out.println(resultado);

    }
}
