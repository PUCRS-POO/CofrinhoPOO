import java.util.*;

public class App {
    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();        

        c.inserirMoeda(new Moeda(NomeMoeda.Um));
        c.inserirMoeda(new Moeda(NomeMoeda.VinteCinco));
        c.inserirMoeda(new Moeda(NomeMoeda.VinteCinco));
        c.inserirMoeda(new Moeda(NomeMoeda.VinteCinco));

        System.out.println("Quantidade de moedas: " + c.quantidadeMoedasCofrinho());
        System.out.println("Valor armazenado em reais: " + c.valorArmazenadoReais());
        System.out.println("Valor armazenado em centavos: " + c.valorArmazenadoCentavos());
        System.out.println("Quantidade de moedas de um tipo: " + c.quantidadeMoedasPorTipo(NomeMoeda.VinteCinco));

        if(c.numeroPosOcupadas() > 0) c.retirarUltimaMoeda();
        if(c.numeroPosOcupadas() > 0) c.retirarUltimaMoeda();
        if(c.numeroPosOcupadas() > 0) c.retirarUltimaMoeda();
        if(c.numeroPosOcupadas() > 0) c.retirarUltimaMoeda();
        if(c.numeroPosOcupadas() > 0) c.retirarUltimaMoeda();

        System.out.println("Quantidade de moedas de um tipo: " + c.quantidadeMoedasPorTipo(NomeMoeda.VinteCinco));
        System.out.println("Total moedas no cofrinho: " + c.quantidadeMoedasCofrinho());

    }
}