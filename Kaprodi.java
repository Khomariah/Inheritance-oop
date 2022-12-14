/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Kaprodi extends Dosen{
    private String jurusan;
    
    public Kaprodi(String nidn,String nama,String jenisKelamin,String jurusan) {
        super(nidn,nama,jenisKelamin);
        this.jurusan = jurusan;
    }
    public void viewKaprodi() {
        System.out.println("jurusan :"+jurusan);
    }
    
}
