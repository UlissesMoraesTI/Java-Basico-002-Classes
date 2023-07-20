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

        //
        System.out.println("");
        System.out.println("Estudando Métodos");

        Data d3 = new Data();
        Data d4 = new Data(31, 12, 2020);


        System.out.println("d1=" + d1.dia + " " + d1.mes + " " + d1.ano);
        System.out.println("d2=" + d2.dia + " " + d2.mes + " " + d2.ano);
        System.out.println("d3=" + d3.dia + " " + d3.mes + " " + d3.ano);
        System.out.println("d4=" + d4.dia + " " + d4.mes + " " + d4.ano);
    }
}
