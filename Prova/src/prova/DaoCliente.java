
package prova;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Alexander Chiudini
 */
public class DaoCliente {
    
    public Cliente lerPorId(Long id) {
        return null;
    }
    
    public List<Cliente> findAllCliente() {
        EntityManager em = (EntityManager) javax.persistence.Persistence.createEntityManagerFactory("Prova1");
        return em.createNamedQuery("listarCliente", Cliente.class)
                .getResultList();
    }
}
