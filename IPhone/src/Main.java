public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Música 1");

        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        meuiPhone.exibirPagina("www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
