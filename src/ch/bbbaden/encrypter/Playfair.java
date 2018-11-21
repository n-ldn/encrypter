package ch.bbbaden.encrypter;

import java.util.ArrayList;
import java.util.Collections;

public class Playfair implements Encryption{

    @Override
    public void encrypt(String plainText) {

        ArrayList<String> splittedPairs = new ArrayList<>();
        String pair = "";
        char[] charray = plainText.toCharArray();
        String output = "";

        for(char character : charray){
            if(pair.length() > 0){
                pair += character + " ";
                splittedPairs.add(pair);
                pair = "";
            }
            else{
                pair += character;
            }
        }

        Collections.shuffle(splittedPairs);

        for(String text : splittedPairs){
            output += text;
        }

        System.out.println(output);
    }
}
