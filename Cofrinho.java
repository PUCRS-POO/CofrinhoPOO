import java.util.*;

public class Cofrinho {
    
    private final int TAMANHO_COFRINHO = 80;
    Moeda moedas[] = new Moeda[TAMANHO_COFRINHO];
    private int posLivre = 0;
    private double valorTotal;

    public Cofrinho() {
        this.valorTotal = 0;
    }

    public double inserirMoeda(Moeda moedaInserida) {

        int valor = moedaInserida.getValorCentavos();
        valorTotal += valor;

        // insere moeda inserida na lista
        moedas[posLivre] = moedaInserida;
        posLivre++;

        return valorTotal;
    }

    public Moeda retirarUltimaMoeda() {
        
        if(numeroPosOcupadas() != 0) {
            NomeMoeda nome = moedas[posLivre-1].getNomeMoeda();
            moedas[posLivre-1] = null;
            Moeda moedaASerRetirada = new Moeda(nome);
            posLivre--;

            return moedaASerRetirada;
        } else {
            return null;
        }
    }

    public int quantidadeMoedasCofrinho() {
        int cont = 0;    

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(moedas[i] != null) {
                if(moedas[i].getValorCentavos() != 0) {                    
                    cont++;
                }
            }
        }

        return cont;
    }

    public int quantidadeMoedasPorTipo(NomeMoeda nome) {    
        int quantidade = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(moedas[i] != null) {
                if(moedas[i].getNomeMoeda() == nome) {
                    quantidade++;
                }
            }
        }

        return quantidade;
    }

    public int valorArmazenadoCentavos() {
        int valor = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(moedas[i] != null) {
                valor += moedas[i].getValorCentavos();
            }
        }

        return valor;
    }

    public double valorArmazenadoReais() {
        double valor = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(moedas[i] != null) {
                valor += moedas[i].getValorReais();
            }
        }

        return valor;
    }

    public int numeroPosOcupadas() {
        int cont = 0;

        for(int i = 0; i < TAMANHO_COFRINHO; i++) {
            if(moedas[i] != null) {
                cont++;
            }
        }

        return cont;
    }
}