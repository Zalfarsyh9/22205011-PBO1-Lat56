/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205011.pbo1.lat56.java;

/**
 *
 * @author User 
 * Nama : Zalfa Rosiyah Riski 
 * Nim : 22205011 
 * Jurusan : Teknik Informatika 
 * Mata kuliah : PBO 1 
 * Deskripsi : Membuat program dengan umur barang antik
 */
class BarangAntik {

    private int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.println("Umur barang antik: " + umur + " tahun");
    }
}

// Radio class
class Radio extends BarangAntik {

    private String name;

    public Radio(int umur) {
        super(umur);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Main class for testing
public class PBO1LAT56Java {

    public static void main(String[] args) {
        Radio radio = new Radio(234);

        // Menggunakan metode dari kelas BarangAntik
        radio.tampilUmur();

        // Menggunakan metode dari kelas Radio
        radio.setName("Radio AM");
        System.out.println("Nama radio: " + radio.getName());
    }
}

