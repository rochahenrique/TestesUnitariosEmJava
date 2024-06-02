import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void testeFizzBuzz() {
        List<String> resultado = FizzBuzz.verificaFizzBuzz(15);
        String[] esperado = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        };
        assertArrayEquals(esperado, resultado.toArray());
    }

    @Test
    public void testeFizz() {
        List<String> resultado = FizzBuzz.verificaFizzBuzz(3);
        String[] esperado = {"1", "2", "Fizz"};
        assertArrayEquals(esperado, resultado.toArray());
    }

    @Test
    public void testeBuzz() {
        List<String> resultado = FizzBuzz.verificaFizzBuzz(5);
        String[] esperado = {"1", "2", "Fizz", "4", "Buzz"};
        assertArrayEquals(esperado, resultado.toArray());
    }

    @Test
    public void testeFizzBuzzNumero() {
        List<String> resultado = FizzBuzz.verificaFizzBuzz(1);
        String[] esperado = {"1"};
        assertArrayEquals(esperado, resultado.toArray());
    }
}
