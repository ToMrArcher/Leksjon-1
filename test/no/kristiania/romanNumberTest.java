package no.kristiania;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanNumberTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romanConverter.toRoman(1));
    }

    @Test
    void shouldConvert2ToII(){
        assertEquals("II", romanConverter.toRoman(2));
    }

}
