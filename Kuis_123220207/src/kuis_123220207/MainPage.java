package kuis_123220207;

import Majalah.RumusMajalah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class MainPage extends JFrame implements ActionListener {
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Silahkan pilih salah satu menu dibawah!");
    
    JButton tombolSubmit = new JButton("Submit");
//    JButton tombolMajalahAnak = new JButton("Majalah Anak");
//    JButton tombolMajalahRemaja = new JButton("Majalah Remaja");
//    JButton tombolMajalahDewasa = new JButton("Majalah Dewasa");
    
    JRadioButton pilihAnak = new JRadioButton("Majalah Anak");
    JRadioButton pilihRemaja = new JRadioButton("Majalah Remaja");
    JRadioButton pilihDewasa = new JRadioButton("Majalah Dewasa");
    
    MainPage(String username){
        setVisible(true);
        setSize(480,480);
        setTitle("Main Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(subheader);
        add(tombolSubmit);
        add(pilihAnak);
        add(pilihRemaja);
        add(pilihDewasa);
//        add(tombolMajalahAnak);
//        add(tombolMajalahRemaja);
//        add(tombolMajalahDewasa);
        
        header.setText("Selamat Datang, " + username);
        header.setBounds(20, 20, 440, 24);
        subheader.setBounds(20, 50, 440, 24);
        
        ButtonGroup pilihMajalah = new ButtonGroup();
        pilihAnak.add(pilihAnak);
        pilihAnak.add(pilihRemaja);
        pilihAnak.add(pilihDewasa);
        
        pilihAnak.setBounds(20, 140, 80, 36);
        pilihRemaja.setBounds(40, 140, 80, 36);
        pilihDewasa.setBounds(60, 140, 80, 36);
        
        tombolSubmit.setBounds(14, 180, 440, 36);
        tombolSubmit.addActionListener(this);
        
//        tombolMajalahAnak.setBounds(14, 150, 440, 36);
//        tombolMajalahAnak.addActionListener(this);
//        
//        tombolMajalahRemaja.setBounds(14, 180, 440, 36);
//        tombolMajalahRemaja.addActionListener(this);
//        
//        tombolMajalahDewasa.setBounds(14, 210, 440, 36);
//        tombolMajalahDewasa.addActionListener(this);
//        
//        tombolMajalahAnak.addActionListener(this);
//        tombolMajalahRemaja.addActionListener(this);
//        tombolMajalahDewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String pilihMajalah = "";
            
            if(pilihAnak.isSelected()){
                new MajalahAnakPage(pilihMajalah);
            } else if(pilihRemaja.isSelected()){
                new MajalahRemajaPage(pilihMajalah);
            } else if(pilihDewasa.isSelected()){
                new MajalahDewasaPage(pilihMajalah);
            }
            
            if(pilihMajalah.isEmpty()){
                throw new Exception("Harap Diisi!")
            };
            
            this.dispose();
            
        } catch (Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
        
//        if(e.getSource() == tombolMajalahAnak){
//            try{
//                new pageMajalahAnak();
//            }
//        } else if(e.getSource() == tombolMajalahRemaja){
//            try{
//                new pageMajalahRemaja();
//            }
//        } else if(e.getSource() == tombolMajalahDewasa){
//            try{
//                new pageMajalahDewasa();
//            }
//        }
    }
}
