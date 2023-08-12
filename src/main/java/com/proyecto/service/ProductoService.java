
package com.proyecto.service;

import com.proyecto.domain.Producto;
import java.util.List;


public interface ProductoService  {
      //Se obtiene un listado de Producto
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un Producto
    public Producto getProducto(Producto producto);
    
    //Se obtiene un nuevo Producto si el id del Producto esta vacio
    //Se actualiza un Producto si el id de la carpeta no esta vacio
    public void save(Producto producto);
    
    //Se elimina la Producto que tiene el id pasado por parametro
    public void delete(Producto producto);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}

