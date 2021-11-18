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
public class Main {
    // Running Program
    public static void main(String[] args) {
        System.out.println("HONDA");
        
        Honda h = new Honda();
        h.tampilkan();
        
        System.out.println("\nSUZUKI");
        
        Suzuki t = new Suzuki();
        t.tampilkan();
    }
    
}
