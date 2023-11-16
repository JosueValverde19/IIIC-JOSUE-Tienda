
package Tienda_JOSUE.demo.dao;

import Tienda_JOSUE.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);

}
