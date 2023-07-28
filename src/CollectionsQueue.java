import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // para fila cheia o retorno é diferente
        fila.add("Abrão");
        fila.add("Bruno");
        fila.add("Ceará");
        fila.offer("Douglas");
        fila.offer("Elton");
        fila.offer("Flaviano");

        //Leitura da fila
        // para fila vazia o retorno é diferente
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        //Tamanho
        System.out.println(fila.size());

        //Limpa
        //fila.clear();

        //Verifica se está vazia
        System.out.println(fila.isEmpty());

        //Ler Proximo
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
