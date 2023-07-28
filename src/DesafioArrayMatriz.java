import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrayMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantidade de Alunos: ");
        int quantidaDeAlunos = entrada.nextInt();


        System.out.println("Informe quantidade de notas a serem lançadas: ");
        int quantidaDeNotas = entrada.nextInt();

        double[][] notasAluno = new double[quantidaDeAlunos][quantidaDeNotas];

        for (int i = 0; i < quantidaDeAlunos; i++) {
            for (int j = 0; j <quantidaDeNotas; j++) {
                System.out.println("Informe a " + (j + 1)  + "º. nota: ");
                //System.out.println("Informe a nota %d do aluno %d: ", n, a);
                notasAluno[i][j] = entrada.nextDouble();
            }
        }

        for ( double[] nota : notasAluno ) {
            System.out.println("Foreach: " + Arrays.toString(nota));
        }

        System.out.println("");
        System.out.println("Qtd Alunos: " + quantidaDeAlunos);
        System.out.println("Qte Notas: " + quantidaDeNotas);
        System.out.println("");

        double totalNotas = 0;

        for (int i = 0; i < quantidaDeAlunos ; i++) {
            totalNotas = 0;
            for (int j = 0; j < quantidaDeNotas ; j++) {
                System.out.println((i + 1) + "º. nota informada: " + notasAluno[i][j]);
                totalNotas += notasAluno[i][j];
            }
            System.out.println("");
            System.out.println("Média Aluno " + (i + 1) + ": " + totalNotas / quantidaDeNotas );
            System.out.println("");
        }

        entrada.close();
    }
}
