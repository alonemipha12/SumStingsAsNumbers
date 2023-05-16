import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata {
  public static String sumStrings(String a, String b) {
    return new BigInteger(a).add(new BigInteger(b)).toString();
  }
}

class SolutionTest {
    @Test
    void test() {
         assertEquals("579", Kata.sumStrings("123", "456"));
    }
}
