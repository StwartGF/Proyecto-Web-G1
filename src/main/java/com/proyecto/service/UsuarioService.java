
package com.proyecto.service;

import com.proyecto.domain.Usuario;
import java.util.List;


public interface UsuarioService {
    //Se obtiene usuario de un List
    public List<Usuario> getUsuarios();
    
    //Se obtiene un Usuario, a partir del id de un usuario
    public Usuario getUsuario(Usuario usuario);
    
    //Se obtiene un Usuario, a partir del username de un usuario
    public Usuario getUsuarioPorUsername(String username);
    
    //Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameYPassword(String username, String password);
    
    //Se obtiene un usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo);
    
    //Se valida si existe un Usuario considerando el username
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo);
    
    //Se inserta un nuevo usaurio si el ide del usuario esta vacio
    //se actualiza un usuario o si el id del usuario NO esta vacío
    public void save(Usuario usuario, boolean crearRolUser);
    
    //Se elimina el usuario que tiene el id pasado por parametro
    public void delete(Usuario usuario);
}
