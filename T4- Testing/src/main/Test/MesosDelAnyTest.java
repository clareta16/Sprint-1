import n1exercici1.MesosDelAny;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MesosDelAnyTest {

    static private List<String> llistaMesos;

    @BeforeAll
    public static void prepararTests(){
        MesosDelAny months = new MesosDelAny();
        llistaMesos = months.rebreMesos();
    }

    @Test
    public void midaLlistaTest() {
        assertEquals(12, llistaMesos.size());
    }

    @Test
    public void comprovarElementsTest() {
        assertNotNull(llistaMesos);
    }

    @Test
    public void agostTest() {
        assertEquals("agost", llistaMesos.get(7));
    }


}