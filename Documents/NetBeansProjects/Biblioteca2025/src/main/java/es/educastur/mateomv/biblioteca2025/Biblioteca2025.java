/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educastur.mateomv.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

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
        b.menuPrincipal();
        
        
    }
    //<editor-fold defaultstate="collapsed" desc="CARGADATOS">
     private void cargaDatos() {
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",2)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    
        for (Libro l:libros) {
            System.out.println(l);
        }
        System.out.println("");
        for (Usuario u:usuarios) {
            System.out.println(u);
        }
        System.out.println("");
        for (Prestamo p:prestamos) {
            System.out.println(p);
        }
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="MENUS">
     private void menuPrincipal() {
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - MENU LIBRO");
            System.out.println("\t\t\t\t2 - MENU USUARIOS");
            System.out.println("\t\t\t\t3 - MENU PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    menuLibro();
                    break;
                }    
                case 2:{
                    menuUsuario();
                    break;
                } 
                case 3:{
                    menuPrestamo();
                    break;
                } 
                 
            }
        }while (opcion != 9);
    }
    private void menuLibro(){
    Scanner sc=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU LIBRO\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - LISTA LIBROS");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - BORRAR LIBRO");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }    
                case 2:{
                    listaLibro();
                    break;
                } 
                case 3:{
                    modificarLibro();
                    break;
                } 
                case 4:{
                    borrarLibro();
                    break;
                } 
            }
        }while (opcion != 9);
 }
     private void menuUsuario(){
    Scanner sc=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU USUARIO\n");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - LISTA USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - BORRAR USUARIO");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }    
                case 2:{
                    listaUsuario();
                    break;
                } 
                case 3:{
                    modificarUsuario();
                    break;
                } 
                case 4:{
                    borrarUsuario();
                    break;
                } 
            }
        }while (opcion != 9);
 }
     private void menuPrestamo(){
    Scanner sc=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tMENU USUARIO\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - LISTA PRESTAMO");
            System.out.println("\t\t\t\t3 - PRORROGA PRESTAMO");
            System.out.println("\t\t\t\t4 - DEVOLUCION PRESTAMO");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }    
                case 2:{
                    listaPrestamo();
                    break;
                } 
                case 3:{
                    prorrogaPrestamo();
                    break;
                } 
                case 4:{
                    devolverPrestamo();
                    break;
                } 
            }
        }while (opcion != 9);
 }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION LIBROS">
     public void nuevoLibro(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Dime el isbn");
          String isbn=sc.nextLine();
          System.out.println("Dime el titulo");
          String titulo=sc.nextLine();
          System.out.println("Dime el autor");
          String autor=sc.nextLine();
          System.out.println("Dime el genero");
          String genero=sc.nextLine();
          System.out.println("Dime los ejemplares");
          int ejemplares=sc.nextInt();
          Libro l=new Libro(isbn,titulo,autor,genero,ejemplares);
          libros.add(l);
     }
      public void listaLibro(){
          for (Libro l : libros) {
              System.out.println(l);
          }
          
     }
      public void modificarLibro(){
         
     }
      public void borrarLibro(){
         
     } 
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GESTION USUARIOS">
       public void nuevoUsuario(){
          Scanner sc=new Scanner(System.in);
           System.out.println("Dime un nombre");
           String nombre=sc.nextLine();
           System.out.println("Dime un dni");
           String dni=sc.nextLine();
           System.out.println("Dime un telefono");
           String telefono=sc.nextLine();
           Usuario u=new Usuario(nombre,dni,telefono);
          usuarios.add(u);
          
     }
      public void listaUsuario(){
          for (Usuario u: usuarios) {
              System.out.println(u);
              
          }
     }
      public void modificarUsuario(){
         
     }
      public void borrarUsuario(){
        Scanner sc=new Scanner(System.in);
          System.out.println("Dime el nombre del usuario que quieres borrar");
          
     }
//</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="GESTION PRESTAMOS">
       public void nuevoPrestamo(){
           System.out.println("Identificación del usuario");
           int posUsuario=buscaDni(solicitaDni());
           if (posUsuario==-1){
               System.out.println("No es aún usuario de la biblioteca");
           }else{
               System.out.println("Identificacion del libro:");
               int posLibro=buscaIsbn(solicitaIsbn());
               if (posLibro==-1){
                   System.out.println("El isbn pertenece a un libro que no tenemos");
               }else if (libros.get(posLibro).getEjemplares()>0){
                   LocalDate hoy=LocalDate.now();
                   
                   prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)  ));
                  
                   libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
                   
                 }else{
                   System.out.println("No quedan unidades disponibles del libro");
                   
               }
               
           }
           
           
     }
      public void listaPrestamo(){
          for (Prestamo p : prestamos) {
              System.out.println(p); 
          }
         
     }
      public void prorrogaPrestamo(){
          System.out.println("Datos para la prorroga del prestamo:");
         int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
         if (pos==-1){
             System.out.println("No hay ningun prestamo con esos datos");
         }else{
             prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
         }
     }
      
      public void devolverPrestamo(){
          System.out.println("Datos para la devolucion del prestamo:");
          String isbnLibro=solicitaIsbn();
         int pos=buscaPrestamo(solicitaDni(), isbnLibro);
         if (pos==-1){
             System.out.println("No hay ningun prestamo con esos datos");
         }else{
             prestamos.get(pos).setFechaDev(LocalDate.now());
             libros.get(buscaIsbn(isbnLibro)).setEjemplares(libros.get(buscaIsbn(isbnLibro)).getEjemplares()+1);
         }
     }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="MÉTODOS AUXILIARES">
      /**
     * Método para buscar dni en la colección de usuarios
     * @param dni (String) del usuario a buscar en la colección
     * @return posición (int) del usuario en el ArrayList, valor -1 si no se encuentra
     */  
    public int buscaDni (String dni){
        int pos=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getDni().equals(dni)){
                pos=i;
                break;
            }
        }
        return pos;
    } 
    
    /**
     * Método para buscar isbn en la colección de libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del libro en el ArrayList, valor -1 si no se encuentra
     */
   public int buscaIsbn (String isbn){
        int pos=-1;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;
    }
   
      /**
     * Método para buscar un prestamo en la colección de prestamos
     * @param dni (String) del usuario que realizó el prestamo
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del prestamo en el ArrayList,
     * valor -1 si no se encuentra un prestamo entre los datos
     */    
     public int buscaPrestamo (String dni, String isbn){
        int pos=-1;
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getUsuarioPrest().getDni().equalsIgnoreCase(dni)
                && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){
                pos=i;
                break;
            }
        }
        return pos;
    }
   /**
    * Método para solicitar por teclado el dni de un usuario
    * @return (String) dni del usuario tecleado
    */
  public String solicitaDni(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Teclea el dni del usuario");
      String dni=sc.next();
      return dni;
  }
  /**
   * Método para solicitar por teclado el isbn de un libro
   * @return (String) isbn del libro tecleado
   */
  public String solicitaIsbn(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Teclea el isbn del usuario");
      String isbn=sc.next();
      return isbn;
  }
//</editor-fold>
 
     
    
}
