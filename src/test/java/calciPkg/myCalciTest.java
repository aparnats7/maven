package calciPkg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myCalciTest {

    @Test
    void sum() {
        myCalci calci = new myCalci();
        int result = calci.sum(20, 10);
        assertEquals(30, result);
    }

    @Test
    void diff() {
    }

    @Test
    void mul() {
    }
}