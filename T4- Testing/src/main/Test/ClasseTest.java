import n1exercici3.Classe;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClasseTest {

    @Test
    public void indexOutOfBoundsExceptionTest() {
        assertThrows(ArrayIndexOutOfBoundsException.class, Classe::indexOutOfBoundsException);
//assertThrows s'utilitza quan un bloc de codi ha de llençar una excepció.
        // assertThrows(classe de l'excepció esperada, codi que executarà l'excepció)
// Com que llança l'excepció el test passa
    }



}
