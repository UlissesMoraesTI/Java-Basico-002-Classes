public class Data {
    int dia;
    int mes;
    int ano;

    String dataFormatadaComBarra() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    String dataFormatadaComPonto() {
        return String.format("%d.%d.%d", dia, mes, ano);
    }

    String dataFormatadaAMD() {
        return String.format("%d%d%d", ano, mes, dia);
    }
    String dataFormatadaDMA() {
        return String.format("%d%d%d", dia, mes, ano);
    }
}
