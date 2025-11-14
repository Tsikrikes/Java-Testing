import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Java1 extends JFrame{
    
    public Java1(){
    
    setTitle("ΧΑΡΤΙ ΚΑΙ ΚΑΛΑΜΑΡΙ");
    setLayout(new GridLayout(9,1,10,10));
    setSize(400,400);
    
    JLabel label = new JLabel("Βαλε το ονομα σου");
    add(label);
    JTextField field = new JTextField();
    add(field);
    JLabel label2 = new JLabel("Βαλε το επιθετο σου");
    add(label2);
    JTextField field2 = new JTextField();
    add(field2);
    JCheckBox checkBox = new JCheckBox("Αποδοχη ορων");
    add(checkBox);
    JRadioButton radio1 = new JRadioButton("Επιλογη 1η");
    JRadioButton radio2 = new JRadioButton("Επιλογη 2η");
    ButtonGroup group = new ButtonGroup();
    group.add(radio1);
    group.add(radio2);
    add(radio1);
    add(radio2);
    JComboBox<String> comboBox = new JComboBox<>(new String[]{"Επιλεξτε Γλωσσα","C++","Java","Python"});
    add(comboBox);
    JButton button = new JButton("ok");
    add(button);
    button.addActionListener(e -> {
        String name = field.getText();
        String surname =field2.getText();
        if(name.isEmpty() || surname.isEmpty()){
            JOptionPane.showMessageDialog(null,"Εισαγετε ονομα.");   
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Γεια σου "+name+" "+surname);
        }}
    );
    JButton clear = new JButton("clear");
    add(clear);
    clear.addActionListener(e ->{
        field.setText("");
        field2.setText("");
        checkBox.setSelected(false);
        group.clearSelection();
        comboBox.setSelectedIndex(0);
    });
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    public static void main(String[] args)
    {
        new Java1();
    }   

}
