import java.util.*;

public class Cofrinho {
    
    private final int TAMANHO_COFRINHO = 80;
    Moeda moedas[] = new Moeda[TAMANHO_COFRINHO];
    private posLivre = 0;
    private double valorTotal;

    public Cofrinho() {
        this.valorTotal = 0;
    }

    public double inserirMoeda(Moeda moedaInserida) {

        int valor = moedaInserida.getValorCentavos();
        valorTotal += valor;

        moedas

        return valorTotal;
    }

    public Moeda retirarUltimaMoeda() {
        if(pilha.size() > 0) {
            Moeda moeda = pilha.pop();
            valorTotal -= moeda.getValorCentavos();
            return moeda;
        } else {
            return null;
        }
    }

    public int quantidadeMoedasCofrinho() {
        return pilha.size();
    }

    public int quantidadeMoedasPorTipo(NomeMoeda nome) {    
        int quantidade = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(pilha[i].getNomeMoeda() == nome) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public int valorArmazenadoCentavos() {
        int valor = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            valor += pilha[i].getValorCentavos();
        }

        return valor;
    }

    public double valorArmazenadoReais() {
        double valor = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            valor += pilha[i].getValorReais();
        }

        return valor;
    }
}