package Internet;
public class NavegadorInternet implements GerenciamentoNavegacao {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página" );
    }
  
    @Override
    public void adicionarNovaAba() {
      System.out.println("Adicionando nova aba.");
    }
  
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
  }