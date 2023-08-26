package lutadores;

public interface InterfaceLutadores {
  public abstract void apresentar();
  public abstract void status();
  public abstract void ganharLuta();
  public abstract void perderLuta();
  public abstract void empatarLuta();

  //Metodos especiais
  public abstract String getNome();
  public abstract String getNacionalidade();
  public abstract int getIdade();
  public abstract double getPeso();
  public abstract double getAltura();
  public abstract String getCategoria();
  public abstract int getVitorias();
  public abstract int getDerrotas();
  public abstract int getEmpates();

  public abstract void setNome(String Nome);
  public abstract void setNacionalidade(String Origem);
  public abstract void setIdade(int Idade);
  public abstract void setPeso(double Peso);
  public abstract void setAltura(int Altura);
}
