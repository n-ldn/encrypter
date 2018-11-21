package ch.bbbaden.encrypter;

public class Caesar implements Encryption{

    @Override
    public void encrypt(String plainText) {

        int SHIFTCOUNT = 3;
        String encryptedText = "";

        int length = plainText.length();
        for(int i = 0; i < length; i++){
            char c = (char)(plainText.charAt(i) + SHIFTCOUNT);
            if (c > 'z')
                encryptedText += (char)(plainText.charAt(i) - (26-SHIFTCOUNT));
            else
                encryptedText += (char)(plainText.charAt(i) + SHIFTCOUNT);
        }

        System.out.println(encryptedText);

    }
}
