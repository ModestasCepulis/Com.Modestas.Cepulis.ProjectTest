import javax.swing.*;

public class WelcomeToTheHouse {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Your name is " + name);


    }
}
