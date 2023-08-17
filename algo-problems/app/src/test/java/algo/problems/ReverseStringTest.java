package algo.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        assertEquals("It Do Just", ReverseString.reverse("Just Do It"));
        assertEquals("It Do Just", ReverseString.reverse(" Just Do It "));
        assertEquals("It Do Just", ReverseString.reverse("Just Do   It"));
        assertEquals("", ReverseString.reverse(" "));
    }

    @Test
    void reverseUsingSplit() {
        assertEquals("It Do Just", ReverseString.reverseUsingSplit("Just Do It"));
        assertEquals("It Do Just", ReverseString.reverseUsingSplit(" Just Do It "));
        assertEquals("It Do Just", ReverseString.reverseUsingSplit("Just Do   It"));
        assertEquals("", ReverseString.reverseUsingSplit(" "));
    }
}