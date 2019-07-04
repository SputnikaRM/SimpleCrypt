package Crypto.src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public Integer rotate;
    ROT13(Character cs, Character cf) {
        rotate= cf - cs;
    }

    // decipher sonnet to finish lab

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        this.rotate=rotate;

        StringBuilder encrypt = new StringBuilder();

        for (int x=0; x<text.length();x++){
            if(Character.isUpperCase(text.charAt(x))){
                char ch = (char)(((int)text.charAt(x)+ rotate -65) % 26 +65);
                encrypt.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(x) + rotate-97)% 26+97);

                encrypt.append(ch);
            }
        }
        return encrypt.toString();
    }

    public String decrypt(String text) {
        // 26-shift to de-cipher
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
