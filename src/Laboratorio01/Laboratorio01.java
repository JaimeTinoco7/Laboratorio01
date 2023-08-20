/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laboratorio01;



public class Laboratorio01 {

   
    public static void main(String[] args) {
      
        
        String nombre = "Juan";
        Persona per = new Persona (nombre);
        per.setApellido("Perez");
        per.setDni("70808633");
        per.setEdad(16);
        
        String imprimir = per.getConsola();
        System.out.println(imprimir);
        
    
        String nombre2 = "Miguel";
        String apellido2 = "Cervantes";
        String dni2 = "11112222";
        Persona per2 = new Persona( nombre2,apellido2,dni2);
        per2.setEdad(21);
        
        
        String imprimir2 = per2.getConsola();
        System.out.println(imprimir2);
        
        
        String nombre3 = "Miguel";
        String apellido3 = "Velasquez";
        String dni3 = "70456734";
        Persona per3= new Persona (nombre3,apellido3,dni3);
        per3.setEdad(19);
        
        String imprimir3 = per3.getConsola();
        System.out.println(imprimir3);
        
        
        
      
    }
    
}
