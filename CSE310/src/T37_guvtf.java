import javax.swing.*;

public class T37_guvtf {
    T37_guvtf(){
        JFrame f = new JFrame();
        JButton b = new JButton("Click me!"); // Adding text to the button
        JTextField tf = new JTextField();
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setSize(400,500); // Setting only width and height
        f.setVisible(true);
        b.setBounds(100,150,200,30); // Setting button bounds with appropriate width and height
        tf.setBounds(100, 200, 200, 30); // Setting text field bounds with appropriate width and height
    }

    public static void main(String[] args) {
        new T37_guvtf();
    }
}

