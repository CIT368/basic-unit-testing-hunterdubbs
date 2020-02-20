import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author Hunter Dubbs
 * CIT368 at PCT
 * This series of JUnit tests verifies the functionality of the format() method in the Telephone class.
 */
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTests {

    @DisplayName("Telephone numbers that are the proper length and not formatted should be returned formatted.")
    @Test
    void formatNumbers(){
        assertTrue(Telephone.format("5551234567").equals("(555)123-4567"));
    }

    @DisplayName("Telephone numbers that are already formatted should be return as is.")
    @Test
    void formattedAlready(){
        assertTrue(Telephone.format("(555)832-5832").equals("(555)832-5832"));
    }

    @DisplayName("Telephone numbers that are not 10 digits long should be returned as is.")
    @ParameterizedTest
    @ValueSource(strings = {"1234", "834982909032", "5559829"})
    void formatInvalidNumbers(String value){
        assertTrue(Telephone.format(value).equals(value));
    }

}
