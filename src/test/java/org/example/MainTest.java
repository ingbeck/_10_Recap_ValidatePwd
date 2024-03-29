package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isMoreThanSeven_whenInputIsP2hber9y_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.isMoreThanSeven(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void hasDigits_whenInputIsP2hber9y_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.hasDigits(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void hasUpperAndLowerChar_whenInputIsP2hber9y_thenReturnTrue(){
        //GIVEN
        String pwd = "P2hber9y";

        //WHEN
        boolean actual = Main.hasUpperAndLowerChar(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isDoubleChar_whenInputIsBb_thenReturnTrue(){
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
        boolean actual = Main.hasIncreasingNumber(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isDecreasingNumber_whenInputIs765_thenReturnTrue(){
        //GIVEN
        String pwd = "765";


        //WHEN
        boolean actual = Main.hasDecreasingNumber(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isWeak_whenInputIsPassword1_thenReturnTrue(){
        //GIVEN
        String pwd = "Password1";

        //WHEN
        boolean actual = Main.isWeak(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isWeak_whenInputIs73Cc4_thenReturnTrue(){
        //GIVEN
        String pwd = "73Cc4";

        //WHEN
        boolean actual = Main.isWeak(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isWeak_whenInputIsHallo123_thenReturnTrue(){
        //GIVEN
        String pwd = "Hallo123";

        //WHEN
        boolean actual = Main.isWeak(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isWeak_whenInputIsIn876beck_thenReturnTrue(){
        //GIVEN
        String pwd = "In876beck";

        //WHEN
        boolean actual = Main.isWeak(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void hasSpecialChar_whenInputIsPas$word_thenReturnTrue(){
        //GIVEN
        String pwd = "Pas$word";

        //WHEN
        boolean actual = Main.hasSpecialChar(pwd);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isSafe_whenInputIs79Agh$rg_thenReturnTrue(){
        //GIVEN
        String pwd = "79Agh$rg";

        //WHEN
        boolean actual = Main.isSafe(pwd);

        //THEN
        assertTrue(actual);
    }

}