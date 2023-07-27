import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantidade de notas a serem lançadas: ");
        int quantidadeNotas = entrada.nextInt();

        double[] notasAluno = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {

            System.out.println("Informe a " + (i + 1)  + "º. nota: ");
            double notas = entrada.nextDouble();
            notasAluno[i] = notas;
        }

        System.out.println("Show! " + Arrays.toString(notasAluno));

        for ( double nota : notasAluno ) {
            System.out.println("Foreach: " + nota);
        }

//        for ( nota : notasAluno ) {
//            System.out.println(nota);
//        }

        System.out.println("QTD: " + quantidadeNotas);

        double totalNotas = 0;

        for (int i = 0; i < quantidadeNotas ; i++) {
            System.out.println((i + 1) + "º. nota informada: " + notasAluno[i]);
            totalNotas += notasAluno[i];
        }

        System.out.println("");
        System.out.println("Média Aluno: " + totalNotas / quantidadeNotas );
        System.out.println("");

        entrada.close();
    }
}
