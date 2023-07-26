/**
 * this para acessar variável que pertence a instância.
 *
 * this se utiliza em métodos que pertence a instância.
 *
 * this não está disponível em contexto estático.
 *
 * this para referenciar o objeto atual.
 *         *
 */
public class Jantar {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 90.0);

        System.out.println("Cliente.: " + pessoa.nome);
        System.out.println("Tem Peso: " + pessoa.peso);

        Comida comida1 = new Comida("Arroz", 0.200);
        pessoa.comer(comida1);

        System.out.println(pessoa.nome + " Comeu " + comida1.peso + " gramas de " + comida1.nome + " no jantar.");

        Comida comida2 = new Comida("Feijão", 0.100);
        pessoa.comer(comida2);

        System.out.println(pessoa.nome + " Comeu " + comida2.peso + " gramas de " + comida2.nome + " no jantar.");

        System.out.println("Desta forma, " + pessoa.nome + " está com " + pessoa.peso + " de peso.");

    }
}
