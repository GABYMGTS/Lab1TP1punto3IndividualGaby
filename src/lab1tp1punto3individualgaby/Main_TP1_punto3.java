/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1tp1punto3individualgaby;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mgts
 */
public class Main_TP1_punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            List<Pelicula> peliculas= new ArrayList();
            
            Scanner lectura = new Scanner (System.in);
         
         boolean continuamos=true;
         
         
          //cargo 3 de arranque x el main
        
        Pelicula peli1 = new Pelicula("Pitufos", "los pitufos", 90);
        Pelicula peli2 = new Pelicula("titanic", "EL TITANIC", 100);
        Pelicula peli3 = new Pelicula("abc", "Director abc", 120);
        
        //guarda una lista de Películas
        
       
        
        
        peliculas.add(peli1);
        peliculas.add(peli2);
        peliculas.add(peli3);
        
        
        while (continuamos){
            
            System.out.println("carga de pelicula");
         
            System.out.println("Ingrese TITULO: ");

                String titulo = lectura.next().toUpperCase();
                
            System.out.println("Ingrese DIRECTOR: ");

                String director = lectura.next().toUpperCase();
                
            System.out.println("Ingrese DURACION: ");

                int duracion = lectura.nextInt();

            peliculas.add(new Pelicula(titulo,director,duracion));
            
             /*   System.out.println("imprimo la lista");
               
               System.out.println("recorro con for i ");
               
              comprobación de cómo va la lista
               
               for (int i = 0; i < peliculas.size(); i++) {
        
        System.out.println(peliculas.get(i).getTitulo()+"//"+
                peliculas.get(i).getDirector()+"//"+peliculas.get(i).getDuracion());
        */
    
               
               //quiere guardar otra PELI o si quiere salir?

System.out.println("¿Quiere guardar otra PELI?   SI/NO");

String rta = lectura.next();
if(rta.equalsIgnoreCase("si")){
    continuamos=true;
  
}else if (rta.equalsIgnoreCase("no")){
    continuamos=false;
    
    //SALIMOS DE CARGA
    
     //Después de ese bucle realizaremos las siguientes acciones:
//A. Mostrar en pantalla todas las películas.
System.out.println("A. Mostrar en pantalla todas las películas.");
for (Pelicula pelicula : peliculas) {
  System.out.println(pelicula.getTitulo()+
          "//"+pelicula.getDirector()+"//"+pelicula.getDuracion());
  }


//B. Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    System.out.println("B. Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 60 minutos");

for (Pelicula pelicula : peliculas) {
  if (pelicula.getDuracion() > 60) {
  System.out.println(pelicula.getTitulo());
  }
  
}

//C. Ordenar las películas de acuerdo a su duración (de mayor a menor), 
//para que luego podamos mostrarlo en pantalla.

System.out.println("películas s/Duración (de Mayor a menor)");
Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());
for (Pelicula cadapeli : peliculas) {
  System.out.println(cadapeli.getTitulo()+"//"+cadapeli.getDuracion());
  }

//D. Ordenar las películas de acuerdo a su duración (de menor a mayor) y
//de esta manera vamos a mostrarlo por pantalla.

    System.out.println("películas s/Duración (de menor a Mayor)");
Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getDuracion));
  for (Pelicula cadapeli : peliculas) {
  System.out.println(cadapeli.getTitulo()+"//"+cadapeli.getDuracion());
  }

  //E. Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

    System.out.println("E: películas por título");


Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo,String.CASE_INSENSITIVE_ORDER));
  for (Pelicula unapeli : peliculas) {
  System.out.println(unapeli.getTitulo());
  }
  
  //F. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 System.out.println("F: películas por director");
    
    Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector,String.CASE_INSENSITIVE_ORDER));
    
  for (Pelicula unapeli : peliculas) {
  System.out.println(unapeli.getTitulo()+"//"+unapeli.getDirector());
  }



}else{//ni si ni no
    System.out.println("ni SI ni NO...respuesta inesperada. Guarda otra peli!!");
    continuamos=true;
   
}
        }
    }
}

