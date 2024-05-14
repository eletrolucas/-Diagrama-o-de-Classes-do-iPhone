public class Simulador {

    public static void main(String[] args) {
      iPhone iphone = new iPhone();
  
      // Reprodutor Musical
      iphone.selecionarMusica();
      iphone.tocarMusica();
      iphone.pausarMusica();
  
      // Aparelho Telefônico
      iphone.ligar();
      iphone.atenderChamada();
      iphone.iniciarCorreioVoz();
  
      // Navegador na Internet
      iphone.exibirPagina();
      iphone.adicionarNovaAba();
      iphone.atualizarPagina();
    }
  }