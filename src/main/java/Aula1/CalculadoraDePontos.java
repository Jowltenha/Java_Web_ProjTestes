package Aula1;

public class CalculadoraDePontos {
    public int calcularPontos(double valorCompra, int anosCliente, boolean ePremiun) {
        if (valorCompra <= 0) return 0;

        int pontosBase = (int) valorCompra;

        if (anosCliente >= 1 && anosCliente <= 4) pontosBase *= 1.1;
        else if (anosCliente >= 5) pontosBase *= 1.2;

        if (ePremiun) pontosBase *= 2;

        return pontosBase;
    }
}
