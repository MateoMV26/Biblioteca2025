/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educastur.mateomv.biblioteca2025;

import java.util.ArrayList;

/**
 *
 * @author alu18d
 */
public class Biblioteca2025 {

    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
    }
    
    
    
    
    public static void main(String[] args) {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menu();
        
        
    }

    private void cargaDatos() {
        
    }

    private void menu() {
        
    }
    /**
 * Metodo de pull request
 * @author sergio iglesias lopez
 */
    private void aportacion(){

         /**
 *Segunda aportacion al proyecto
 * @author sergio iglesias lopez
 */
    }
    private void aportacion2(){
        System.out.println("¿Esto funciona?");
    }
}
