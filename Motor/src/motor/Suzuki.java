/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author ACER
 */
public class Suzuki extends Motor {
    // Anak kedua dari motor
    public void tampilkan() {
        String bahanbakar;
        
        bahanbakar="Premium";
        
        Motor m = new Motor();
        
        m.inputData("Mio", "Matic", "Putih");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar"+bahanbakar);
    }
}
