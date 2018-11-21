package ch.bbbaden.encrypter;

import java.util.ArrayList;

public class RailFence implements Encryption{

    @Override
    public void encrypt(String plainText) {

        String s1 = "";
        String s2 = "";
        int count = 0;
        char[] charray = plainText.toCharArray();

        for(char character : charray){

            count++;
            if((count % 2) != 0){
                s1 += character;
            }
            else{
                s2 += character;
            }
        }

        System.out.println(s1+s2);
    }
}
