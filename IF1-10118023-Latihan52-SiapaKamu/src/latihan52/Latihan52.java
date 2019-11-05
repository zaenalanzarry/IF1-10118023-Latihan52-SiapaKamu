/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan52;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Siapa Kamu
 */

public class Latihan52 {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
          
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(29);
        dosen.setNama("Rizki Adam Kurniawan");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
          
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118023");
        mahasiswa.setKelas("IF-1");
        mahasiswa.setNama("Zaenal Anzarry");
        mahasiswa.setUmur(19);
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
