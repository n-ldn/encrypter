package ch.bbbaden.encrypter;

public class Main {

    public static void main(String[] args) {

        Encrypter encrypter = new Encrypter();
        Gui gui = new Gui();

        encrypter.setEncryption(new Caesar());
        encrypter.encrypt(gui.input("Your String (Caesar):"));

        encrypter.setEncryption(new RailFence());
        encrypter.encrypt(gui.input("Your String (RailFence):"));

        encrypter.setEncryption(new Playfair());
        encrypter.encrypt(gui.input("Your String (Playfair):"));

    }
}
