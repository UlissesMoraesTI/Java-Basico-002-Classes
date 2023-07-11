public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 27;
        d1.mes = 12;
        d1.ano = 1974;

        System.out.println(d1.dataFormatadaComBarra());
        System.out.println(d1.dataFormatadaComPonto());
        System.out.println(d1.dataFormatadaAMD());
        System.out.println(d1.dataFormatadaDMA());

        Data d2 = new Data();
        d2.dia = 25;
        d2.mes = 12;
        d2.ano = 2023;




    }
}
