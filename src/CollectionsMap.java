import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Antonio");
        usuarios.put(2, "Beto");
        usuarios.put(3, "Celio");

        System.out.println("");
        System.out.println("Está Vazia?");
        System.out.println(usuarios.isEmpty());

        System.out.println("");
        System.out.println("Tamaho");
        System.out.println(usuarios.size());

        System.out.println("");
        System.out.println("Chaves?");
        System.out.println(usuarios.keySet());

        System.out.println("");
        System.out.println("Valores?");
        System.out.println(usuarios.values());

        System.out.println("");
        System.out.println("Chave e Valores");
        System.out.println(usuarios.entrySet());

        System.out.println("");
        System.out.println("Contém?");
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Beto"));

        System.out.println("");
        System.out.println("get: Informe Chave, Receba Valor");
        System.out.println(usuarios.get(2));

        System.out.println("");
        System.out.println("3 (Três) formas de percorrer o Map");
        System.out.println("1º. Por Chave");

        for ( int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        System.out.println("");
        System.out.println("2º. Por Valor");

        for ( String valor : usuarios.values() ) {
            System.out.println(valor);
        }

        System.out.println("");
        System.out.println("*** Atenção *** java.util.Map");
        System.out.println("3º. Por Chave e Valor");

        for ( Map.Entry<Integer, String> registro : usuarios.entrySet() ) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }

        System.out.println("");
        System.out.println("Removendo...");
        System.out.println(usuarios.remove(1));

        for ( Map.Entry<Integer, String> registro : usuarios.entrySet() ) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }


    }
}
