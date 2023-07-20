public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial) {
        nome = nomeInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}
