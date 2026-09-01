package br.senac.tads.dsw.Exemplo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.tads.dsw.Exemplo2.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

    
} 