/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author acer
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ketua ketua = new Ketua("00120018","Dudung Saprudung","Laki-laki",2017,2);
       Kaprodi kaprodi = new Kaprodi("12300011","Yutun Sapruyun","Laki-laki","Teknik Informatika");
       
       ketua.viewDosen();
       ketua.viewKetua();
       
       kaprodi.viewDosen();
       kaprodi.viewKaprodi();
    }
    
}
