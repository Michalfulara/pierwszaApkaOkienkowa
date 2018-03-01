import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class window implements ActionListener{
    JFrame ramka;
    JButton przycisk;

    public static void main(String[] args){
        window przyciski = new window();
        przyciski.zbudujGUI();

    }
public void zbudujGUI(){
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(200,200);
        ramka.setTitle("Nowy Program");
        ramka.setVisible(true);
        przycisk = new JButton();
        przycisk.setText("OK");
        przycisk.addActionListener(this);

        ramka.getContentPane().add(BorderLayout.EAST,przycisk);




    }



public void actionPerformed(ActionEvent akcja){
        if (akcja.getSource() == przycisk)
            System.out.println("Działa");
        else
            System.out.println("nie dziala");
}
}
