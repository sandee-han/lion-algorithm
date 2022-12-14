package bracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")  // solve_bracket_return_boolean
    void bracket() {
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solutionWithStack("()()"));
        assertTrue(sb.solutionWithStack("(())()"));
        assertFalse(sb.solutionWithStack(")()("));
        assertFalse(sb.solutionWithStack("(()("));
        assertFalse(sb.solutionWithStack("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}