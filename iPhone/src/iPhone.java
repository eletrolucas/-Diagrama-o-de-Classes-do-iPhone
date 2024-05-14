import Internet.NavegadorInternet;
import Musica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
  
    public iPhone() {
      this.reprodutorMusical = new ReprodutorMusical();
      this.aparelhoTelefonico = new AparelhoTelefonico();
      this.navegadorInternet = new NavegadorInternet();
    }

    // Métodos para utilizar as funcionalidades de Reprodução Musical
    public void tocarMusica() {
        reprodutorMusical.tocarMusica();
      }
    
      public void pausarMusica() {
        reprodutorMusical.pausarMusica();
      }
    
      public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
      }
    
      // Métodos para utilizar as funcionalidades de Aparelho Telefônico
      public void ligar() {
        aparelhoTelefonico.ligar();
      }
    
      public void atenderChamada() {
        aparelhoTelefonico.atenderChamada();
      }
    
      public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
      }
    
      // Métodos para utilizar as funcionalidades de Navegador na Internet
      public void exibirPagina() {
        navegadorInternet.exibirPagina();
      }
    
      public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
      }
    
      public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
      }
}