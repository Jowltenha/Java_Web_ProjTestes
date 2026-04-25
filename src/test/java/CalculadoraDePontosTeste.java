import Aula1.CalculadoraDePontos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraDePontosTeste {
    @Test
    public void testeRegra01(){
        // O calculo de um valor 0 retorna 0

        CalculadoraDePontos calculadoraDePontos = new CalculadoraDePontos();
        double valorCompra = 0.0;

        int pontos = calculadoraDePontos.calcularPontos(valorCompra, 0, false);

        Assertions.assertEquals(0, pontos);
    }

    @Test
    public void testeRegra02SemCentavos(){
        var calPontos = new CalculadoraDePontos();
        double valorCompra = 99.0;
        int anosCliente = 0;
        boolean ePremiun = false;

        int pontos = calPontos.calcularPontos(valorCompra, anosCliente, ePremiun);

        Assertions.assertEquals(99, pontos);
    }
}
