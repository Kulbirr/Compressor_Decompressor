package GUI;

import Comp_Decomp.Compressor;
import Comp_Decomp.Decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
    JButton CompressButton;
    JButton DecompressButton;

    AppFrame() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JLabel label = new JLabel("Compressor and Decompressor");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.setBackground(Color.YELLOW);
        panel.setBounds(150, 40, 460, 20);
        add(panel);

//        To prevent Copying
        JLabel Down = new JLabel("Whoever copies this is Gay 🗿");
        Down.setBounds(130, 500, 500, 20);
        Down.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(Down);


//       Compress Buttons
        CompressButton = new JButton("Compress");
        CompressButton.setBounds(150, 120, 200, 30);
        CompressButton.addActionListener(this);

//        Decompress Button
        DecompressButton = new JButton("Decompress");
        DecompressButton.setBounds(390, 120, 200, 30);
        DecompressButton.addActionListener(this);

        add(CompressButton);
        add(DecompressButton);


        setLocation(400, 20);
        setSize(800, 600);
        getContentPane().setBackground(Color.cyan);
//        this.setBackground(Color.cyan);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == CompressButton) {
            JFileChooser FileChooser = new JFileChooser();
            int response = FileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(FileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    Compressor.method(file);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        }
        if (a.getSource() == DecompressButton) {
            JFileChooser FileChooser = new JFileChooser();
            int response = FileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(FileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try {
                    Decompressor.method(file);
                } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e.toString());
                }
            }

        }
    }
}

//class BackgroundImageExample extends JFrame {
//    public BackgroundImageExample() {
//        setLayout(new BorderLayout());
//
//        // Loading the image file
//        ImageIcon imageIcon = new ImageIcon("/C:/Users/kulbi/OneDrive/Pictures/Wallaper/preview.jpg");
//        Image image = imageIcon.getImage();
//
//        // Creating a new JLabel and set its icon to the image
//        JLabel background = new JLabel(new ImageIcon(image));
//        add(background);
//
//        // Adding other components to the JFrame as needed
//
//        setSize(500, 500);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//    }
//}