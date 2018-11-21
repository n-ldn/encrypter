package ch.bbbaden.encrypter;

public class Encrypter {

    Encryption encryption;

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    public void encrypt(String text){
        encryption.encrypt(text);
    }
}
