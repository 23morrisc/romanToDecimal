import static org.junit.Assert.*;

public class RomanToDecimalTest {

    /**
     * Unit test for romanToDecimal
     * @version 10/3/2021
     * @author 23morrisc
     */

    @org.junit.Test
    public void romanToDecimal() {

        //assert equals

        //valid
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11);
        assertEquals(RomanToDecimal.romanToDecimal("CCV"), 205);
        assertEquals(RomanToDecimal.romanToDecimal("cLiI"), 152);
        assertEquals(RomanToDecimal.romanToDecimal("MMMMM"), 5000);
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("III"), 3);
        assertEquals(RomanToDecimal.romanToDecimal("MDCIX"), 1609);
        assertEquals(RomanToDecimal.romanToDecimal("XXIX"), 29);
        assertEquals(RomanToDecimal.romanToDecimal("mviii"), 1008);
        assertEquals(RomanToDecimal.romanToDecimal("mdclxvi"), 1666);

        //invalid
        assertEquals(RomanToDecimal.romanToDecimal("Q"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("EEOO"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("i_smell_like_beef"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("BEANs"), -1);

        //logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("IIII"), 4);
        assertEquals(RomanToDecimal.romanToDecimal("IXIX"), 18);
        assertEquals(RomanToDecimal.romanToDecimal("MMMMDDDD"), 6000);
        assertEquals(RomanToDecimal.romanToDecimal("ivxlcdm"), 1444);

        //assert not equals

        assertNotEquals(RomanToDecimal.romanToDecimal("IC"), 99);
        assertNotEquals(RomanToDecimal.romanToDecimal("ISIS"), 2);

    }
}