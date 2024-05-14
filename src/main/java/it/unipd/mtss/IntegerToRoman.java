////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {

        if (number < 1 || number > 1000) {
            return "Numero non valido";
        }
        String roman = "";

        while (number == 1000) {
            roman += "M";
            number -= 1000;        }

        while (number >= 900) {
            roman += "CM";
            number -= 900;
        }

        while (number >= 500) {
            roman += "D";
            number -= 500;
        }

        while (number >= 400) {
            roman += "CD";
            number -= 400;
        }

        while (number >= 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }

        while (number >= 50) {
            roman += "L";
            number -= 50;
        }

        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }

        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;


        /* Codice 500
        if (number < 1 || number > 500)
            return "Numero non valido";
        String roman = "";

        while (number == 500) {
            roman += "D";
            number -= 500;
        }
        while (number >= 400) {
            roman += "CD";
            number -= 400;
        }

        while (number >= 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }

        while (number >= 50) {
            roman += "L";
            number -= 50;
        }

        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }

        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */

        /* Codice 100
        if (number < 1 || number > 100)
            return "Numero non valido";
        String roman = "";

        while (number == 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }

        while (number >= 50) {
            roman += "L";
            number -= 50;
        }

        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }

        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */

       /* Codice 50
        if (number < 1 || number > 50)
            return "Numero non valido";
        String roman = "";

        while (number == 50) {
            roman += "L";
            number -= 50;
        }

        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }

        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */

        /* Codice 20
        if (number < 1 || number > 20)
            return "Numero non valido";
        String roman = "";

        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */

        /* Codice 10
        if (number < 1 || number > 10)
            return "Numero non valido";
        String roman = "";

        while (number == 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */

        /* COdice 6
        if (number < 1 || number > 6)
            return "Numero non valido";
        String roman = "";

        while (number >= 5) {
            roman += "V";
            number -= 5;
        }

        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */


        /* Codice 3
        if (number < 1 || number > 3)
            return "Numero non valido";
        String roman = "";

        while(number > 0){
            roman += "I";
            number -= 1;
        }

        return roman;
        */
    }
}