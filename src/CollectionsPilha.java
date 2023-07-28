import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionsPilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("livro1");
        livros.add("livro2");
        livros.push("livro3");
        livros.push("livro4");

        //ler
        System.out.println("lendo...");
        System.out.println(livros.peek());
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.element());

        //Delete
        System.out.println(livros.pop());
        System.out.println(livros.poll());

        //ler
        System.out.println("lendo...");
        System.out.println(livros.peek());
        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.element());

        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();

        System.out.println("");
        System.out.println("Foreach");

        for ( String livro : livros ) {
            System.out.println(livro);
        }
    }
}
