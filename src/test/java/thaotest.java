import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class thaotest {
    plus p = new plus();

    @Test
    public void testMethodplus() {
        assertEquals(5, p.cong(3, 2));
        assertNotEquals(10, p.cong(6, 7));

        int[] mang1 = {1, 2, 3, 4};
        int[] mang2 = {10, 20, 30, 40};
        int[] mang = {11, 22, 33, 44};
        assertArrayEquals(mang, p.congmang(mang1, mang2));

        String str1 = null;
        String str2 = "Đặng Phương Thảo";
        assertNull(str1);
        assertNotNull(str2);

        assertTrue(p.soduong(100));
        assertFalse(p.soduong(-100));
        
        String str3 = str2;
        String str4 = new String(str2);
        assertSame(str2, str3);
        assertNotSame(str2, str4);
    }

}
