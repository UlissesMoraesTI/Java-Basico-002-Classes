import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHoraAtual {
    public static void main(String[] args) {

        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        System.out.println(data + " - " + hora);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Date dataHoraAtual2 = new Date();
        String data2 = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual2);
        String hora2 = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual2);
        System.out.println(data2 + " - " + hora2);
    }
}
