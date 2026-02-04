public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Reprodutor musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Aparelho telefônico
        iphone.ligar("+55 11 91234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador de internet
        iphone.exibirPaginas("https://www.example.com");
        iphone.adcionarNovaAba();
        iphone.atualizarPagina();
    }
}
