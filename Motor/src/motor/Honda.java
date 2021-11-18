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
public class Honda extends Motor {
    //Anak pertama dari motor
    public void tampilkan() {
        String bahanbakar="Premium";
        
        Motor m = new Motor();
        
        m.inputData("Blade", "Bebek", "Hitam");
        m.tampilkandata();
        
        System.out.println("jenis bahan bakar"+bahanbakar);
    }
}
