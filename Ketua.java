/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Ketua extends Dosen {
    private int tahunMulai;
    private int jabatanKe;
    
    public Ketua (String nidn,String nama,String jenisKelamin,int tahunMulai,int jabatanKe){
        super(nidn,nama,jenisKelamin);
        this.tahunMulai = tahunMulai;
        this.jabatanKe = jabatanKe;
    }
    public void viewKetua(){
        System.out.println("Tahun mulai jabatan:"+tahunMulai);
        System.out.println("Jabatan Ketua Ke-:"+jabatanKe);
    }
}
