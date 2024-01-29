package org.example;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(generateRandomPwd());

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
                pwd.equals("123456") ||
                pwd.equals("654321");
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

    /*
    public static boolean hasIncreasingNumber(String pwd){

        boolean increasedFound = false;

        if(hasDigits(pwd)){
            for(int i = 1; i < pwd.length(); i++){
                if(Character.getNumericValue(pwd.charAt(i)) > Character.getNumericValue(pwd.charAt(i-1))){
                    increasedFound = true;
                }
            }
        }

        return increasedFound;
    }
    */

    /*
    public static boolean hasDecreasingNumber(String pwd){

        boolean deacreasedFound = false;

        if(hasDigits(pwd)){
            for(int i = 1; i < pwd.length(); i++){
                if(Character.getNumericValue(pwd.charAt(i)) < Character.getNumericValue(pwd.charAt(i-1))){
                    deacreasedFound = true;
                }
            }
        }

        return deacreasedFound;
    }
    */
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
                }
            }
        }

        return specialFound;
    }

    public static String generateRandomPwd(){

        Random random = new Random();
        String pwd = "";
        String options =    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                            "abcdefghijklmnopqrstuvwxyz" +
                            "1234567890" +
                            "!?%§$()=+-,;.:_<>*#";

        //int lengthPdw = random.nextInt(12);


        do{
            for(int i = 0; i < 8; i++){

                pwd += options.charAt(random.nextInt(options.length() -1));

            }
        }while (isWeak(pwd) && !hasDigits(pwd) && !hasSpecialChar(pwd) && !hasUpperAndLowerChar(pwd) && !isMoreThanSeven(pwd));

        return pwd;
    }

}