
package com.proyecto.service;

import com.proyecto.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Se obtiene un listado de categoria
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene un Categoría, a partir del id de un Ccategoria
    public Categoria getCategoria(Categoria categoria);
    
    //Se obtiene un nuevo Categoria si el id del categoria esta vacio
    //Se actualiza un categoria si el id de la carpeta no esta vacio
    public void save(Categoria categoria);
    
    //Se elimina la categoria que tiene el id pasado por parametro
    public void delete(Categoria categoria);
}
