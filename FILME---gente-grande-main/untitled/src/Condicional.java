public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean incluidoNoPlano = true;
        double notaFilme = 9.9;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2023) {
            System.out.println("Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme de comedia que vale a pena assistir!");
        }

        if (true == incluidoNoPlano || tipoPlano.equals("Pluss")) {
            System.out.println("Filme liberado com o plano incluindo!");
        } else {
            System.out.println("Deve pagar o Plus!");
        }
    }
}
