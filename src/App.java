import java.util.ArrayList;
// import java.util.Scanner;

import lutadores.Lutador;
import lutas.Luta;

public class App {
    public static void main(String[] args) {
        ArrayList<Lutador> lutadores = new ArrayList<Lutador>();
        // Scanner leia = new Scanner(System.in);

        Lutador lutador1 = new Lutador("Pretty Boy", "USA", 27, 174, 65.2, 10, 4, 6);
        lutadores.add(lutador1);

        Lutador lutador2 = new Lutador("UfoCobol", "Australia", 30, 191, 101.9, 8, 8, 4);
        lutadores.add(lutador2);

        Lutador lutador3 = new Lutador("PutScript", "Brazil", 29, 180, 80.3, 9, 2, 9);
        lutadores.add(lutador3);

        Lutador lutador4 = new Lutador("CSharp", "Germany", 21, 171, 69.8, 14, 1, 5);
        lutadores.add(lutador4);

        Lutador lutador5 = new Lutador("Matlab", "England", 25, 188, 86, 7, 10, 3);
        lutadores.add(lutador5);

        Lutador lutador6 = new Lutador("HTML&CSS", "Finland", 34, 189, 98, 10, 10, 0);
        lutadores.add(lutador6);


        Luta novaLuta = new Luta();
        novaLuta.marcarLuta(lutadores.get(0), lutadores.get(3));
        novaLuta.lutar();

    }
}
