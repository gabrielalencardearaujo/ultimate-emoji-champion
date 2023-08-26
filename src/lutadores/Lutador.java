package lutadores;

public class Lutador implements InterfaceLutadores {
  //Atributos
  private String nome, nacionalidade, categoria;
  private int idade, vitorias, derrotas, empates, altura;
  private double peso;

  public Lutador(
      String Nome,
      String Nacionalidade,
      int Idade,
      int Altura,
      double Peso,
      int Vitorias,
      int Derrotas,
      int Empates) {
    this.nome = Nome;
    this.nacionalidade = Nacionalidade;
    this.idade = Idade;
    this.altura = Altura;
    this.setPeso(Peso);
    this.vitorias = Vitorias;
    this.derrotas = Derrotas;
    this.empates = Empates;
  }

  // Metodos Personalizados
  @Override
  public void apresentar() {
    System.out.println("\nIt's time!!!!\n");
    System.out.println("Lutador: " + this.getNome());
    System.out.println("Origem: " + this.getNacionalidade());
    System.out.println("Idade: " + this.getIdade() + " anos");
    System.out.println("Altura: " + this.getAltura() + " cm");
    System.out.println("Peso: " + this.getPeso() + " kg");
    System.out.println("Vitorias: " + this.getVitorias());
    System.out.println("Derrotas " + this.getDerrotas());
    System.out.println("Empates " + this.getEmpates());
  }

  public void status() {
    System.out.println(this.getNome());
    System.out.println("é um peso " + this.getCategoria());
    System.out.println("com " + this.getVitorias() + " vitorias");
    System.out.println(this.getDerrotas() + " derrotas");
    System.out.println(this.getEmpates() + " empates");
  }

  public void empatarLuta() {
    this.setEmpates();
  }

  public void ganharLuta() {
    this.setVitorias();
  }

  public void perderLuta() {
    this.setDerrotas();
  }

  private void setCategoria(){
    if(this.getPeso() < 52.2) {
      this.categoria = "Invalida. Abaixo do peso necessario.";
    } else if(this.getPeso() <=70.3 ) {
      this.categoria = "Leve";
    } else if(this.getPeso() <=84 ) {
      this.categoria = "Medio";
    } else if(this.getPeso() <=110.3 ) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Invalida. Acima do peso necessario.";
    }
  }


  // Metodos especiais
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
    this.setCategoria();
  }

  public String getCategoria() {
    return categoria;
  }

  public int getVitorias() {
    return vitorias;
  }

  public int getDerrotas() {
    return derrotas;
  }

  public int getEmpates() {
    return empates;
  }

  private void setVitorias(){
    this.vitorias += 1;
  }

  private void setDerrotas(){
    this.vitorias += 1;
  }

  private void setEmpates(){
    this.vitorias += 1;
  }
}
