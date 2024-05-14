package Telefone;
public class AparelhoTelefonico implements GerenciamentoChamadas {

    @Override
    public void ligar() {
      System.out.println("Ligando");
    }
  
    @Override
    public void atenderChamada() {
      System.out.println("Atendendo chamada.");
    }
  
    @Override
    public void iniciarCorreioVoz() {
      System.out.println("Ativando correio de voz.");
    }
  }