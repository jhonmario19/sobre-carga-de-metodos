/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jairo F
 */
public class Rectangulo {
    
    // atributos de instancia
    private double base;
    private double altura;
    
    // metodo constructor por defecto
    public Rectangulo(){
        
        this(10, 5);
        
    }
    
    public Rectangulo(double b,double a){
        
        this.altura=a;
        this.base=b;
        
    }
    
    public Rectangulo(double b){
        
        this(b, 10);
        
    }
    
    // metodos getter
    public double getAltura(){
        return this.altura;
    }
    
    public double getBase(){
        return this.base;
    }
    
    //metodos setter
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    // metodos miembros
    
    public double calcularArea(){
        return this.altura * this.base;
    }
    
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
    
    public double areaDiferencia(double area){
        
        double diferencia = Math.abs(this.calcularArea()-area);
        return diferencia;
    }
    
    public double areaDiferencia (Rectangulo r){
        
        return this.areaDiferencia(r.calcularArea());
        
    }
}
