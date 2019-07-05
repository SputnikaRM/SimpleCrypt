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

        return "";
    }

    public String encrypt(String text) {
      return null;
    }

    public String decrypt(String text) {
        // 26-shift to de-cipher
        return text;
    }

    public static String rotate(String s, Character c) {

     Integer rotate=13;

        StringBuilder encrypt = new StringBuilder();

        for (int x=0; x<s.length();x++){
            if(isUpperCase(s.charAt(x))){
                char ch = (char)(((int)s.charAt(x)+  rotate-65) % 26 +65);
                encrypt.append(ch);
            }
            else {
                char ch = (char)(((int)s.charAt(x) + rotate-97)% 26+97);

                encrypt.append(ch);
            }
        }
        return encrypt.toString();


    }

}
