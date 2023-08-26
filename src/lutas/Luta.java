package lutas;

import lutadores.Lutador;

public class Luta implements InterfaceLuta {
  private Lutador desafiado, desafiante;
  private int rounds;
  private boolean aprovado;

  public void lutar() {
    if(this.getAprovado()) {
      int vencedor = (int)Math.round((Math.random() * 3)); //Gerar um valor aleatorio entre 0 e 2.
      System.out.println(vencedor);

      this.getDesafiado().apresentar();
      this.getDesafiante().apresentar();

      switch(vencedor){
        case 0: //Empate
          this.getDesafiado().empatarLuta();
          this.getDesafiante().empatarLuta();

          System.out.println("\nA luta terminou empatada!");
          break;

        case 1: //Ganha Desafiado
          this.getDesafiado().ganharLuta();
          this.getDesafiante().perderLuta();

          System.out.println("\nVitoria do " + this.getDesafiado().getNome());
          break;

        case 2: //Ganha Desafiante;
          this.getDesafiado().perderLuta();
          this.getDesafiante().ganharLuta();

          System.out.println("\nVitoria do " + this.getDesafiante().getNome());

        default:
          System.out.println("\nAlgo inesperado aconteceu aqui. Tente novamente.");
      }
    } else {
      System.out.println("\nA luta nao pode acontecer. ");
    }
  }

  public void marcarLuta(Lutador lut1, Lutador lut2) {
    if ((lut1.getCategoria() == lut2.getCategoria()) && lut1 != lut2) {
      this.setAprovado(true);
      this.setDesafiado(lut1);
      this.setDesafiante(lut2);
    } else {
      this.setAprovado(false);
      this.setDesafiado(null);
      this.setDesafiante(null);
    }
  }

  public Lutador getDesafiado() {
    return this.desafiado;
  }

  public void setDesafiado(Lutador lutador) {
    this.desafiado = lutador;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean getAprovado() {
    return aprovado;
  }

  public void setAprovado(boolean aprovado) {
    this.aprovado = aprovado;
  }

  
  
}
