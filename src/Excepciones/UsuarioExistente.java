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
public class UsuarioExistente extends Exception {

    /**
     * Creates a new instance of <code>UsuarioExistente</code> without detail
     * message.
     */
    public UsuarioExistente() {
    }

    /**
     * Constructs an instance of <code>UsuarioExistente</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UsuarioExistente(String msg) {
        super(msg);
    }
}
