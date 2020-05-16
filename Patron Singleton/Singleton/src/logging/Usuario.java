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
public class Usuario {

    private String nombreUsuario;
    private String apellidoUsuario;
    private static Usuario usuario;

    private Usuario(String nombreUsuario, String apellidoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
    }

    public static Usuario getUsuario(String nombreUsuario, String apellidoUsuario) {
        if (usuario == null) {
            usuario = new Usuario(nombreUsuario, apellidoUsuario);
        }
        return usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

}
