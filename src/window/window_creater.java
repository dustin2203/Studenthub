package window;

import javax.swing.*;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class window_creater {
    // Attribute JFrame window
    JFrame window;
    GraphicsEnvironment graphics =
            GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice device = graphics.getDefaultScreenDevice();

    // Method to create a new Window
    // requires: a string which defines the title.
    public JFrame createNewWindow(String title) {
        this.window = new JFrame("Button Example");
        return this.window;
    }

    // Method to create a new Textfield
    // requires: four bound values, defining where the tf should appear.
    public JTextField createNewTestField(int x, int y, int width, int height) {
        final JTextField text_field = new JTextField();
        text_field.setBounds(x, y, width, height);
        return text_field;
    }

    // Method to create a new Button
    //requires: four bound values, defining where the tf should appear.
    public JButton createNewJButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }

    // Method to set the window size.
    //requires: width and height of the window.
    public void setWindowSize(int width, int height) {
        this.window.setSize(width, height);
    }

    //Method to set the window size to fullscreen.
    public void setWindowToFullScreen() {
        device.setFullScreenWindow(this.window);
    }

    //Method to finish the setup and sets the window to visible.
    public void finishSetUp() {
        this.window.setVisible(true);
    }

   //TODO:: Implement ActionListeners

    public static void main(String[] args) {

        window_creater window = new window_creater();
        window.createNewWindow("Test");
        window.createNewJButton("Test", 10, 10, 10, 10);
        window.setWindowToFullScreen();
        System.out.print("WindowCreatorFinished");

    }
}



