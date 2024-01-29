package org.example;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isMoreThanSeven(String pwd){
        return pwd.length() > 7;
    }

    public static boolean hasDigits(String pwd){

        char[] digits = {'1','2','3','4','5','6','7','8','9','0'};
        boolean digitFound = false;

        for(int i = 0; i < pwd.length(); i++){
            for(char digit : digits){
                if (pwd.charAt(i) == digit) {
                    digitFound = true;
                    break;
                }
            }
        }
        return digitFound;
    }

    public static boolean hasUpperAndLowerChar(String pwd){

        boolean upChar = false;
        boolean lowChar = false;

        for(int i = 0; i < pwd.length(); i++){
            if(Character.isUpperCase(pwd.charAt(i))){
                upChar = true;
            } else if (Character.isLowerCase(pwd.charAt(i))){
                lowChar = true;
            }
        }

        return upChar && lowChar;

    }

    public static boolean isWeak(String pwd){

        return isDoubleChar(pwd) ||
                pwd.contains("Password") ||
                hasDecreasingNumber(pwd) ||
                hasIncreasingNumber(pwd);
    }

    public static boolean isDoubleChar(String pwd){

        String str = pwd.toLowerCase();
        boolean doubleFound = false;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                doubleFound = true;
            }
        }

        return doubleFound;
    }

    public static boolean hasIncreasingNumber(String pwd){

        boolean increasedFound = false;

        if(hasDigits(pwd)){
            for(int i = 1; i < pwd.length(); i++){
                if(pwd.charAt(i) >= pwd.charAt(i-1)){
                    increasedFound = true;
                }
            }
        }

        return increasedFound;
    }

    public static boolean hasDecreasingNumber(String pwd){

        boolean deacreasedFound = false;

        if(hasDigits(pwd)){
            for(int i = 1; i < pwd.length(); i++){
                if(pwd.charAt(i) <= pwd.charAt(i-1)){
                    deacreasedFound = true;
                }
            }
        }

        return deacreasedFound;
    }

    public static boolean hasSpecialChar(String pwd){

        char[] specials = {'!','?','%','§',
                '$','(',')','=','+',
                '-',',',';',':','.',
                '_','<','>','*','#'};

        boolean specialFound = false;

        for(int i = 0; i < pwd.length(); i++){
            for(char special : specials){
                if (pwd.charAt(i) == special) {
                    specialFound = true;
                    break;
                }
            }
        }

        return specialFound;
    }

}