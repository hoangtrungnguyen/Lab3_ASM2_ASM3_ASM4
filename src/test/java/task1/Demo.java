package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Demo {

    /*
     Kiểm tra xem hai mảng có bằng nhau khoong
     */
    @Test
    void assertArrayEqualDemo(){
        String[] expectedArray = new String[]{
                "a", "b", "c"
        };

        String[] actualArray = new String[]{
                "a", "b", "c"
        };
        assertArrayEquals(expectedArray,actualArray);
    }

    /***
     * So sánh hai giá trị đã băng nhau chưa
     */
    @Test
    void assertEqualsDemo(){
        Assertions.assertEquals("a","a");
    }

    /***
     * Kiểm tra xem giá trị có phải false không
     */
    @Test
    void assertFalse(){
        Assertions.assertFalse(false);
    }

    /***
     * Kiểm tra giá trị có khác null không
     */
    @Test
    void assertNotNulls(){
        assertNotNull("d");
    }

    /***
     * Kiểm tra xem hai giá trị có khác nhau không
     */
    @Test
    void assertNotSameDemo(){
        assertNotSame("b","a");
    }

    /**
     * Kiểm tra xem hai giá trị có giống nhau không
     */
    @Test
    void assertSameDemo(){
        assertSame("a","a");
    }

    /***
     * Kiểm tra xem giá trị có null không. Nếu null thì test được thỏa mãn
     */
    @Test
    void assertNullDemo(){
        assertNull(null);
    }


    /***
     * Assert that không còn được hỗ trợ trong Junit 5
     */
     @Test
    void assertThatDemo(){
//         assertThat()
     }

    /***
     * Fail assertion sẽ ném ra một AssertionError
     */
     @Test
     void failDemo(){
         try {
             if(true){
                 throw new Exception("Fail demo");
             }
             fail("Expected exception was not thrown");
         } catch (Exception e) {
             assertNotNull(e);
         }
     }

    /***
     * Assert True nếu giá trị trả về là TRUE thì test sẽ pass
     */
    @Test
    void assertTrueDemo(){
        assertTrue(true);
    }


}
