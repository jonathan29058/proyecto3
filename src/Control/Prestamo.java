/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Libros;
import Modelo.Prestamos;

import java.util.HashSet;

/**
 *
 * @author Patricia
 */
public class Prestamo {
    private HashSet<Prestamo> pres;

    public Prestamo(HashSet<Prestamo> pres) {
        this.pres = pres;
    }
    
    
    
    public void agregar(Prestamo p){
        pres.add(p);
    }
    
    
}
