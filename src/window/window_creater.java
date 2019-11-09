package window;

import javax.swing.*;
import java.awt.event.*;

public class window_creater {
    // Attribute JFrame window
    JFrame window;

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

    public void initializeWindow(int width, int height ) {
        this.window.setSize(width,height);
        this.window.setVisible(true);
    }

   // public ActionListener addActionListener() {

  //  }


       // f.add(b);f.add(tf);
      //  f.setSize(400,400);
       // f.setLayout(null);
       // f.setVisible(true);


    public static void main(String[] args) {

        window_creater window = new window_creater();
        window.createNewWindow("Test");
        window.createNewJButton("Test", 10, 10, 10, 10);
        window.initializeWindow(400, 400);
        System.out.print("WindowCreatorFinished");

    }
}



