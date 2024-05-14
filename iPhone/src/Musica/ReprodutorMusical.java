package Musica;
public class ReprodutorMusical implements ControleReproducao {
 
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }
  
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada" );
    }
  
    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
