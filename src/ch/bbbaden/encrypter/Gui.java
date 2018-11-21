package ch.bbbaden.encrypter;

import javax.swing.*;

public class Gui {

    public String input(String message){
        return JOptionPane.showInputDialog(null, message,"Input",JOptionPane.PLAIN_MESSAGE);
    }
}
