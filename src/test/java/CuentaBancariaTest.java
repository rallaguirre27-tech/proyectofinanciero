import org.junit.jupiter.api.Test;
import unsch.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Corrección: El documento abría la clase con "(" en lugar de "{".
public class CuentaBancariaTest {

    @Test
        // Corrección: Se eliminó el espacio en el nombre del método ("depositoDebe IncrementarSaldo")
    void depositoDebeIncrementarSaldo() {
        // Corrección: Las líneas de código estaban mezcladas en el PDF. Se ordenaron correctamente.
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.obtenerSaldo());
    }
}


