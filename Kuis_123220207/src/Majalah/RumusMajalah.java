package Majalah;

import Majalah.RumusMajalah;
import javax.swing.JFrame;

/**
 *
 * @author Lab Informatika
 */
//public class pageMajalahAnak extends JFRame implements ActionListener{
//    
//}
        
        
public class RumusMajalah implements kumpulanMajalah{
    
    private double harga, jumlah, total;
    
    public RumusMajalah(double harga, double jumlah, double total){
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    

    @Override
    public double Total() {
        return harga * jumlah;
    }
    
}
