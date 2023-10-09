import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CodSoft3 atmGUI = new CodSoft3(1000);
                atmGUI.setVisible(true);
            }
        });
    }
}