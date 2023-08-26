package lutas;
import lutadores.Lutador;

public interface InterfaceLuta {
  public abstract void marcarLuta(Lutador lutador1, Lutador lutador2);
  public abstract void lutar();
  public abstract void setDesafiado(Lutador lutador);
  public abstract Lutador getDesafiado();
}
