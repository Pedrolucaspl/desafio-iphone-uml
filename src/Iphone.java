public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando: " + (musicaAtual != null ? musicaAtual : "(nenhuma música selecionada)"));
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPaginas(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
