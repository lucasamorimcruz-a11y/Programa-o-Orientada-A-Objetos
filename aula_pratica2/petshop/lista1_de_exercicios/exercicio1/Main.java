

public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new Assinatura();
        Assinatura assinatura2 = new Assinatura("Padrão", 120.00, 12);
        Filme filme = new Filme();
        Filme filme2 = new Filme(1.40, "Missão impossível", "Suspense", 14);
        Serie serie = new Serie();
        Serie serie2 = new Serie("Twin peaks", "Suspense", 10, 10);
        Usuario user = new Usuario();
        Usuario user2 = new Usuario("Lucas", 0, null, 0);
        assinatura.getValidadeDaAssinatura();
        assinatura.setNomeDaAssinatura("Premium");
        filme.setNomeDoFilme("Twin Peaks: Fire Walk With Me");
        System.out.println(assinatura.toString());
        System.out.println(assinatura2.toString());
        System.out.println(filme.toString());
        System.out.println(filme2.toString());
        System.out.println(serie.toString());
        System.out.println(serie2.toString());
        System.out.println(user.toString());
        System.out.println(user2.toString());
        
    }

}
