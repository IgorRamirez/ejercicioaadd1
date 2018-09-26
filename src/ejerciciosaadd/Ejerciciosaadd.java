/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaadd;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xp
 */
public class Ejerciciosaadd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File f = new File("D:\\Igor Ramirez\\ejercicioaadd.xml");

        if (f.exists()) {
            System.out.println("Nombre: " + f.getName());
            System.out.println("Directorio padre: " + f.getParent());
            System.out.println("Ruta relativa: " + f.getPath());
            System.out.println("Ruta absoluta: " + f.getAbsolutePath());
        }
        System.out.println("------------------------");

Ejerciciosaadd obj_libros = new Ejerciciosaadd();

    obj_libros.EscribeFicheroTexto();
    obj_libros.LeerFicheroTexto();
    }

    public void EscribeFicheroTexto() {

        String texto = "<Libros><Libro><Titulo>El Capote</Titulo></Libro></Libros>";

        String nombre = "src\\ejerciciosaadd\\libros.xml";

        try {

            FileWriter fichero = new FileWriter(nombre);

            fichero.write(texto + "\r\n");

            fichero.close();
        } catch (IOException ex) {

            System.out.println("error al acceder al fichero");
        }

        System.out.println("------------------------");
  
    }
    
    
    
    
    
    
    
    
    
    
    
     

    

    public int LeerFicheroTexto() {

        try {
            FileReader a = new FileReader("src\\ejerciciosaadd\\libros.xml");
            //Se lee el fichero
            int caracter = a.read();
            while (caracter != -1) {
                System.out.print((char) caracter);
                //que se pare
                caracter = a.read();
            }

        } catch (IOException ex) {
            System.out.println("error al leer al fichero");
        }
        return -1;
    }




}


//la ruta del archivo
//file f =new File("proyecto\\libros.xml");
/*  Ficheros obj_fichero = new Ficheros();
    
  System.out.println("Escitura y lectura del fichero librosFileWriter.xml");
  obj_fichero.EscribeFicheroTextoFileWriter();
  obj_fichero.LeerFicheroTextoFileReader();
  
             
  
  
  System.out.println("------------------------");
       
  
  System.out.println("Escitura y lectura del fichero librosFileWriter.xml");
    obj_fichero.EscribirFicheroTextoBufferedWriter();     
   obj_fichero.LeerFicheroTextoBufferedReader();  
    
    }
    
}*/
