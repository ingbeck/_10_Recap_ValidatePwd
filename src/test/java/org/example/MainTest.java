package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isMoreThanSeven_whenP2hber9yIsPassed_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.isMoreThanSeven(pwd);

        //THEN
        assertTrue(actual);
    }


}