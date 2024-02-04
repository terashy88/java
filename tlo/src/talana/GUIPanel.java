package talana;

import javax.swing.JOptionPane;

public class GUIPanel {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie Ihr Alter ein: ");
        var alter = Integer.parseInt(eingabe);
        if (alter < 18) {
            JOptionPane.showMessageDialog(
                    null, "Sorry, noch nicht volljährig!");

        } else {
            JOptionPane.showMessageDialog(
                    null, "Glückwunsch! Sie sind volljährig!");
        }
    }
}
