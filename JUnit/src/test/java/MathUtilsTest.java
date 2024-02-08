import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {

        private MathUtils mathUtils;

        @Before
        public void setUp() {
            mathUtils = new MathUtils();
        }

        @Test
        public void testAdd() {
            int result = mathUtils.add(3, 5);
            assertEquals(8, result);
        }

        @Test
        public void testSubtract() {
            int result = mathUtils.subtract(10, 4);
            assertEquals(6, result);
        }

        @Test
        public void testMultiply() {
            int result = mathUtils.multiply(2, 7);
            assertEquals(14, result);
        }

        @Test
        public void testDivide() {
            double result = mathUtils.divide(8, 2);
            assertEquals(4.0, result, 0.0001); // Specify a delta for double values
        }

        @Test
        public void testDivideByZero() {
            double result = mathUtils.divide(10, 0);
            assertEquals(-1.0, result, 0.0001); // Specify a delta for double values
        }

        @After
        public void tearDown() {
            mathUtils = null;
        }

}
