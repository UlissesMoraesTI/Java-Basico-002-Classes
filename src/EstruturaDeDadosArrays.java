import java.util.Arrays;

public class EstruturaDeDadosArrays {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double notaTotalAluno = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            notaTotalAluno += notasAlunoA[i];
        }
        System.out.println("Média aluno = " + notaTotalAluno / 3);

        System.out.println("");
        System.out.println("ou");
        System.out.println("");

        double[] notasAlunoB = { 5.0, 5.0, 5.0 };

        System.out.println(Arrays.toString(notasAlunoB));
    }
}
