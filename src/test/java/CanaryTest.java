import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanaryTest {

    @Test
    public void devePassar() {
        // Arrumacao -> Montar o cenario
        boolean canary = true;

        // Acao -> Agir no que se está testando
        boolean isTrue = canary == true;

        // Averifiguacao -> Verficar se retornou o que se espera
        Assertions.assertTrue(isTrue);
    }
}
