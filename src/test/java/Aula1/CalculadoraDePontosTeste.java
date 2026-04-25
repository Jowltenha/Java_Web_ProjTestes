package Aula1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraDePontosTeste {

    private CalculadoraDePontos calPontos = new CalculadoraDePontos();

    @Test
    public void testeRegra01(){
        // O calculo de um valor 0 retorna 0
        double valorCompra = 0.0;

        int pontos = calPontos.calcularPontos(valorCompra, 0, false);

        Assertions.assertEquals(0, pontos);
    }

    @Test
    public void testeRegra02SemCentavos(){
        double valorCompra = 99.0;
        int anosCliente = 0;
        boolean ePremiun = false;

        int pontos = calPontos.calcularPontos(valorCompra, anosCliente, ePremiun);

        Assertions.assertEquals(99, pontos);
    }

    @Test
    public void testeRegra03Ano1(){
        double valorCompra = 100.0;
        int anosCliente = 1;
        boolean ePremiun = false;

        int pontos = calPontos.calcularPontos(valorCompra, anosCliente, ePremiun);

        Assertions.assertEquals(110, pontos);
    }

    @Test
    public void testeRegra03Ano5(){
        double valorCompra = 100.0;
        int anosCliente = 5;
        boolean ePremiun = false;

        int pontos = calPontos.calcularPontos(valorCompra, anosCliente, ePremiun);

        Assertions.assertEquals(120, pontos);
    }

    @Test
    public void testeRegra04EPremiun(){
        double valorCompra = 100.0;
        int anosCliente = 0;
        boolean ePremiun = true;

        int pontos = calPontos.calcularPontos(valorCompra, anosCliente, ePremiun);

        Assertions.assertEquals(200, pontos);
    }
}
