/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Patricia
 */
public class UsuarioRegistrado extends Exception {

    /**
     * Creates a new instance of <code>UsuarioRegistrado</code> without detail
     * message.
     */
    public UsuarioRegistrado() {
    }

    /**
     * Constructs an instance of <code>UsuarioRegistrado</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UsuarioRegistrado(String msg) {
        super(msg);
    }
}
