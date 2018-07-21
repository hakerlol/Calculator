import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculator {
        @Test
        void testIntDiv(){
               String s1 = "15";
               String s2 = "5";
              Assertions.assertEquals(3, Integer.parseInt( Calculator.getResult(s1, s2)));
        }

        @Test
        void testDoubleDiv(){
                String s1 = "15";
                String s2 = "10";
                Assertions.assertEquals(1.5, Double.parseDouble( Calculator.getResult(s1, s2)));
        }
        @Test
        void testZeroDiv(){
                String s1 = "15";
                String s2 = "0";
               Assertions.assertThrows(NullPointerException.class, ()-> Calculator.getResult(s1, s2));
        }
}
