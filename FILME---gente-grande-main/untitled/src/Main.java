public class Main {
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match!");
        System.out.println("Filme: Gente Grande");

        int anoDeLancamento = 2010;
        System.out.println("anoDeLançamento :" + anoDeLancamento);
        Boolean incluindo = true;
        double notaFilme = 9.9;
        //Medias calculadas pelas 3 notas de Fernanda, Lucas e Joicy;
        double media = (9.9 + 7.2 + 8.3) /3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de comedia, onde a morte do treinador de basquete de infância de velhos amigos reúne a turma no mesmo lugar que celebraram um campeonato anos atrás. Os amigos, acompanhados de suas esposas e filhos, descobrem que idade não significa o mesmo que maturidade.";
        System.out.println(sinopse);

        int classcificacao;
        classcificacao = (int) (media /8);
        System.out.println(classcificacao);
    }
}