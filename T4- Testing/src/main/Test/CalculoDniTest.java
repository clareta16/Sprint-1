import n1exercici2.CalculoDni;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "34567891, A",
            "39975262, B",
            "45903928, Z",
            "92039482, D",
            "12345612, E",
            "10349506, F",
            "44444444, G",
            "99999304, H",
            "77782216, K"
    })
    void testCalcularLletraDni(int dni, char lletraEsperada){
        assertEquals(lletraEsperada, CalculoDni.calcularLletraDni(dni));
    }
}

