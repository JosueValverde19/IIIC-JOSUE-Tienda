
package Tienda_JOSUE.demo.service;
//imports de la clase
import Tienda_JOSUE.demo.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List <Categoria> getCategorias(boolean activos);
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
    
}// Fin de la clase