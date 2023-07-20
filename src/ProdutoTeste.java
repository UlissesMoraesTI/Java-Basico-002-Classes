public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 452.00;
        p1.desconto = 0.05;

        Produto p2 = new Produto("Celular");
        //p2.nome = "Celular";
        p2.preco = 500.02;
        p2.desconto = 0.15;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do Carrinho = R$%.2f.", mediaCarrinho);
        System.out.println("");

        Produto p3 = new Produto("Fone");
        //p3.nome = "Fone";
        p3.preco = 250.50;
        p3.desconto = 0.10;

        double valorComDesconto = p3.precoComDesconto();
        System.out.printf("Preço Final: R$%.2f.", valorComDesconto);

        // Sem Método
        //double precoFinal1 = p1.preco * (1 - p1.desconto);
        //double precoFinal2 = p2.preco * (1 - p2.desconto);

        // Com Método
        //double precoFinal1 = p1.preco * (p1.precoComDesconto());
        //double precoFinal2 = p2.preco * (p2.precoComDesconto());


    }
}
