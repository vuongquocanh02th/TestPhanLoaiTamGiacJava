import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    private final TriangleClassifier classifier = new TriangleClassifier();
    @Test
    void testEquilateralTriangle() {
        assertEquals("Tam giac deu", classifier.classifyTriangle(2,2,2));
    }
    @Test
    void testIsoscelesTriangle() {
        assertEquals("Tam giac can",  classifier.classifyTriangle(2,2,3));
    }
    @Test
    void testScaleneTriangle() {
        assertEquals("Tam giac thuong", classifier.classifyTriangle(3,4,5));
    }
    @Test
    void testNotATriangle(){
        assertEquals("Khong phai tam giac", classifier.classifyTriangle(3,9,5));
    }
    @Test
    void testNegativeSide(){
        assertEquals("Khong phai tam giac", classifier.classifyTriangle(2,2,-1));
    }
    @Test
    void testInvalidSide(){
        assertEquals("Khong phai tam giac", classifier.classifyTriangle(2,1,3));
    }
    @Test
    void testZeroSide(){
        assertEquals("Khong phai tam giac", classifier.classifyTriangle(2,0,3));
    }
}