/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.ControlPersonal;
import Excepciones.UsuarioExistente;

/**
 *
 * @author Patricia
 */
public class pruebaUsuario {

    public static void main(String[] args) throws UsuarioExistente {
        ControlPersonal c = new ControlPersonal();
        Personal p1 = new Personal("admin", "hola");
        Personal p2 = new Personal("admin2", "hola"); 
        Personal p3 = new Personal("admin2", "hola");    
        Personal p4 = new Personal("admin53532", "hola");  
         
        try{ 
        c.agregar(p1);
        c.agregar(p2);
           System.out.println("Usuario registrado");
        } catch (UsuarioExistente ex) {
            System.out.println("Usuario repetido");
        }
        c.Verificar(p4);
        
    }
}
