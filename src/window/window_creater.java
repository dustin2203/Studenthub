package window;

import javax.swing.*;
import java.awt.event.*;

public class window_creater {

    // Method to create a new Window
    // requires: a string which defines the title.
    public static JFrame createNewWindow(String title) {
        JFrame frame = new JFrame("Button Example");
        return frame;
    }

    // Method to create a new Textfield
    // requires: four bound values, defining where the tf should appear.
    public static JTextField createNewTestField(int x, int y, int width, int height) {
        final JTextField text_field=new JTextField();
        text_field.setBounds(x, y, width, height);
        return text_field;
    }

    public static JButton createNewJButton(String text, int x, int y, int width, int height) {
        JButton button=new JButton(text);
        button.setBounds(x, y, width, height);
        return button;
    }

    public static void startWindow(){

    }


    JFrame f = createNewWindow("Test");
    final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
    JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf.setText("Welcome to Javatpoint.");
        }
    });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
}
