/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Excepciones.UsuarioExistente;
import Excepciones.UsuarioRegistrado;
import Modelo.Personal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.util.HashSet;

/**
 *
 * @author Patricia
 */
public class ControlPersonal {

    private HashSet<Personal> personal;

    public ControlPersonal() {
        File file = new File("Personal.dat");
        if (file.exists()) {
            personal = cargarPersonal();
        } else {
            personal = new HashSet<>();
        }
    }
    
     public static String md5(String clear) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(clear.getBytes());
        int size = b.length;
        StringBuffer h = new StringBuffer(size);
        //algoritmo y arreglo md5
        for (int i = 0; i < size; i++) {
            int u = b[i] & 255;
            if (u < 16) {
                h.append("0" + Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        //clave encriptada
        return h.toString();
    }
     
    public void Verificar(Personal p) throws UsuarioExistente{
        if(personal.contains(p)==true){      
             throw new UsuarioExistente();
        }
         
       
    }
    private HashSet<Personal> cargarPersonal() {
        try {
            File file = new File("Personal.dat");
            FileInputStream input = new FileInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(input);

            HashSet<Personal> crear = (HashSet<Personal>) reader.readObject();

            reader.close();
            input.close();

            return crear;
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {

        }
        return null;
    }

    public void agregar(Personal p) throws UsuarioExistente {
        if (!personal.add(p)) {
            throw new UsuarioExistente();
           
        }
    }

    public void guardar() {
        try {
            File file = new File("Personal.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(output);

//            System.out.println("****");
//            for (Libros l : libros) {
//                System.out.println(l);
//            }
//            System.out.println("****");
            writer.writeObject(personal);
            writer.close();
            output.close();
        } catch (IOException ex) {

        }
    }

    public Object[] obtenerDatos() {
        return personal.toArray();
    }

    public Personal buscar(int idx) {
        Object[] objs = personal.toArray();
        Personal l = (Personal) objs[idx];
        return l;
    }

}
