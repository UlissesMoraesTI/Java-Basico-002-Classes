public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

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
