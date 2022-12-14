/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Dosen {
    private String nidn;
    private String nama;
    private String jenisKelamin;
    
    public Dosen(String nidn,String nama,String jenisKelamin){
        this.nidn = nidn;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
       
    }
    public void viewDosen() {
        System.out.println("NIDN:"+nidn);
        System.out.println("Nama:"+nama);
        System.out.println("Jenis kelamin:"+jenisKelamin);
    }
    
}
