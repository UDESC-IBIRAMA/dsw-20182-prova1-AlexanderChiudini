
package Prova1.Questao4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Chiudini
 */

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
    
    @Autowired
    ClienteRepositorio clientes;
    
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cli) {
        return clientes.save(cli);
    }
    
    @GetMapping
    public List<Cliente> buscarTodos() {
        return clientes.findAll();
    }
    
//    @PutMapping("{id}")
//    public void update(@PathVariable id) {
////        clientes.
//    }
}
