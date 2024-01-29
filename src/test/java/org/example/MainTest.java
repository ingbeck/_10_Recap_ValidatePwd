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

    @Test
    void hasDigits_whenP2hber9yIsPassed_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.hasDigits(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void hasUpperAndLowerChar_whenP2hber9yIsPassed_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.hasUpperAndLowerChar(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isDoubleChar_whenBbIsPassed_thenReturnTrue(){
        //GIVEN
        String pwd = "Bb";

        //WHEN
        boolean actual = Main.isDoubleChar(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isIncreasingNumber_whenInputIs567_thenReturnTrue(){
        //GIVEN
        String pwd = "567";

        //WHEN
        boolean actual = Main.hasIncreasdNumber(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isWeak_whenPassword1IsPassed_thenReturnTrue(){
        //GIVEN
        String pwd = "Password1";

        //WHEN
        boolean actual = Main.isWeak(pwd);

        //THEN
        assertTrue(actual);
    }


}