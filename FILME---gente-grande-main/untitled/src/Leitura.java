import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite o seu filme favorito");
        String Filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Diga sua avaliaçao para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(Filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);
    }
}
