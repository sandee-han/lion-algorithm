package arrayandstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueLetterTest {

    @Test
    void isUniqueTest() {
        UniqueLetter uniqueLetter = new UniqueLetter();
        // stream 중복제거 테스트
        Assertions.assertEquals(false, uniqueLetter.isUnique1("hello"));
        Assertions.assertEquals(true, uniqueLetter.isUnique1("hi do"));

        // set 중복제거 테스트
        Assertions.assertEquals(false, uniqueLetter.isUnique2("hello"));
        Assertions.assertEquals(true, uniqueLetter.isUnique2("hi do"));
    }
}