/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

/**
 *
 * @author Tonny
 */
public class Logging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario u = Usuario.getUsuario("Andrea", "Castro");
        System.out.println("Usuario: " + u.getNombreUsuario() + " " + u.getApellidoUsuario());

    }

}
