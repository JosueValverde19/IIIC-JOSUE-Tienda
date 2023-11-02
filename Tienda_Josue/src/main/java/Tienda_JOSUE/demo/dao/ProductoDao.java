
package Tienda_JOSUE.demo.dao;

import Tienda_JOSUE.demo.domain.Producto; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
