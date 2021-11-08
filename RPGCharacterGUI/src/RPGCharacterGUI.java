import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class RPGCharacterGUI {


    static JButton addition;
    static JLabel resultLabel1;
    static JLabel resultLabel2;
    static JLabel resultLabel3;
    static JLabel strength;
    static JTextField enterHere;
    static JLabel wisdom;
    static JTextField enterHere2;
    static JLabel Dexterity;
    static JTextField enterHere3;


    public RPGCharacterGUI() {

        JFrame window = new JFrame("Character Stats");
        JPanel panel = new RPGPlayerStats();
        strength = new JLabel("ENTER STRENGTH HERE<");
        enterHere = new JTextField(10);
        wisdom = new JLabel("ENTER WISDOM HERE<");
        enterHere2 = new JTextField(10);
        Dexterity = new JLabel("ENTER DEXTERITY HERE<");
        enterHere3 = new JTextField(10);

        addition = new JButton("+");



        resultLabel1 = new JLabel("0.00");
        resultLabel2 = new JLabel("0.00");
        resultLabel3 = new JLabel("0.00");


        window.setSize(400, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


addition.addActionListener(new additionListener());


panel.add(addition);
        panel.add(strength);
        panel.add(enterHere);
        panel.add(wisdom);
        panel.add(enterHere2);
        panel.add(Dexterity);
        panel.add(enterHere3);
        panel.add(resultLabel1);
        panel.add(resultLabel2);
        panel.add(resultLabel3);


        window.add(panel);
        window.setVisible(true);


    }

    private static class RPGPlayerStats extends JPanel {
        public RPGPlayerStats() {

            setBackground(new Color(127, 127, 128));
        }
    }
    private static class additionListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){

        }
    }
}









