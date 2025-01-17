package Crypto.src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public Integer rotate;

    public ROT13(Character cs, Character cf) {
        rotate= cf - cs;
    }

    // decipher sonnet to finish lab

    public ROT13() {
        this.rotate=13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return text;
    }

    public String encrypt(String text) {
        Integer rotate= 13;

        StringBuilder encrypt = new StringBuilder();

        for (int x=0; x<text.length();x++){
            if(Character.isLetter(text.charAt(x))){
                if(isUpperCase(text.charAt(x))){
                char ch = (char)(((int)text.charAt(x)+  rotate-65) % 26 +65);
                encrypt.append(ch);
            }
                else {
                char ch = (char)(((int)text.charAt(x) + rotate-97)% 26+97);

                encrypt.append(ch);
            }
        } else {
               encrypt.append(text.charAt(x));
            }
        }
        System.out.println(encrypt.toString());
        return encrypt.toString();



    }

    public String decrypt(String text) {
        Integer rotate= 26-13;
        StringBuilder encrypt = new StringBuilder();

        for (int x=0; x<text.length();x++){
            if(Character.isLetter(text.charAt(x))){
                if(isUpperCase(text.charAt(x))){
                    char ch = (char)(((int)text.charAt(x)+  rotate-65) % 26 +65);
                    encrypt.append(ch);
                }
                else {
                    char ch = (char)(((int)text.charAt(x) + rotate-97)% 26 + 97);

                    encrypt.append(ch);
                }
            } else {
                encrypt.append(text.charAt(x));
            }
        }


        System.out.println(encrypt.toString());
        return encrypt.toString();


        // 26-shift to de-cipher

    }

    public static String rotate(String s, Character c) {


//     Integer rotate= c-s.charAt(0);
//        StringBuilder encrypt = new StringBuilder();
//
//        for (int x=0; x<s.length();x++){
//            if(isUpperCase(s.charAt(x))){
//                char ch = (char)(((int)s.charAt(x)+  rotate-65) % 26 +65);
//                encrypt.append(ch);
//            }
//            else {
//                char ch = (char)(((int)s.charAt(x) + rotate-97)% 26+97);
//
//                encrypt.append(ch);
//            }
//        }
//        return encrypt.toString();
        Integer rotate = s.indexOf(c);

       String x= s.substring(rotate) + s.substring(0, rotate);
       return x;


    }

}
