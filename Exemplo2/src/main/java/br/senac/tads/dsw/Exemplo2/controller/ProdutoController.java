package br.senac.tads.dsw.Exemplo2.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.senac.tads.dsw.Exemplo2.model.Produto;
import br.senac.tads.dsw.Exemplo2.repository.ProdutoRepository;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

    @RestController
    @RequestMapping("/api/produtos")
    
    public class ProdutoController {
        private final ProdutoRepository repository;
        public ProdutoController(ProdutoRepository repository) {
            this.repository = repository;
        }

        @PostMapping 
        public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto){

            Produto produtoSalvo = repository.save(produto);

            URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produtoSalvo.getId())
                .toUri();

                return ResponseEntity.created(location).body(produtoSalvo);
        }



        
    
}
