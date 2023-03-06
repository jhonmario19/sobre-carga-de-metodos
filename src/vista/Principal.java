/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Rectangulo;

/**
 *
 * @author Jairo F
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r = new Rectangulo();
        System.out.println("Area:"+ r.calcularArea());
       imprimirRectangulo(r);
        
        System.out.println("-------------------------------");
        
        Rectangulo a = new Rectangulo();
        a.setAltura(50);
        a.setBase(30);
        imprimirRectangulo(a);
        
        Rectangulo c = new Rectangulo(50, 30);
        imprimirRectangulo(c);
        
        Rectangulo m = new Rectangulo(50);
        imprimirRectangulo(m);
        
        System.out.println("Diferencia area a y c : "+a.areaDiferencia(c.calcularArea()));
        
    }
    
    public static void imprimirRectangulo(Rectangulo r){
        System.out.println("Area:"+ r.calcularArea());
        System.out.println("Perimetro:"+ r.calcularPerimetro());
    }
    
}
