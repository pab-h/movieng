package views;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        super("Movieng");

        this.setupJFrame();

        this.setupHome();

    }

    private void setupHome() {
        Home home = new Home(this);
        this.add(home);
    }

    private void setupJFrame() {
        int scale = 250;

        this.setSize(
                4 * scale,
                3 * scale
        );
        this.setVisible(true);
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
