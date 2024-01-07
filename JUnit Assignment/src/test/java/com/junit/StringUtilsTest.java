package com.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils stringUtils = new StringUtils();
        
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));

        assertEquals("4321", stringUtils.reverse("1234"));
        assertEquals("aabbcc", stringUtils.reverse("ccbbaa"));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils stringUtils = new StringUtils();

        assertTrue(stringUtils.isPalindrome("radar"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertTrue(stringUtils.isPalindrome("level"));
        assertFalse(stringUtils.isPalindrome("world"));
    }

    @Test
    public void testConcatenate() {
        StringUtils stringUtils = new StringUtils();

        assertEquals("HelloWorld", stringUtils.concatenate("Hello", "World"));
        assertEquals("", stringUtils.concatenate("", ""));

        assertEquals("Concatenate", stringUtils.concatenate("Con", "catenate"));
        assertEquals("123456", stringUtils.concatenate("123", "456"));
    }

    @Test
    public void testCountOccurrences() {
        StringUtils stringUtils = new StringUtils();

        assertEquals(2, stringUtils.countOccurrences("hello", 'l'));
        assertEquals(0, stringUtils.countOccurrences("", 'a'));

        //assertEquals(3, stringUtils.countOccurrences("abracadabra", 'a'));
        assertEquals(4, stringUtils.countOccurrences("aaaa", 'a'));
    }
}
