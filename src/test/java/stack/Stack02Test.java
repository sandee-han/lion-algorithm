package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    Stack02 st = new Stack02();

    // 각 테스트가 실행되기 전에 실행되는 구간
    // 각 테스트는 독립적으로 실행되어야 한다.
    // 여기엔 db에서 데이터를 넣거나 지우는 코드를 넣음
    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
    }

    // 테스트 코드에서 할 수 있는 것들
    // 1. 테스트하는 코드를 만들어서 다음에도 실행할 수 있게
    // 2. 기능설계

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        // .push()
        // .getArr()
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("pop 잘 되는지")
    void pushAndPop() {
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }

    @Test
    void isEmpty() {
        st.pop();
        st.pop();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>();
        st.pop();
    }

    @Test
    void peek() {
        Stack02 st = new Stack02();
        // stack이 비었는데 peek() 할 때
        // Execption의 테스트
        assertThrows(EmptyStackException.class,() ->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }


}