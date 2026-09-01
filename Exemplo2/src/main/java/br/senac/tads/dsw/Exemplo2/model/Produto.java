package br.senac.tads.dsw.Exemplo2.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private Double preco;

        public Produto() {
        }

        public Produto(String nome, Double preco) {
            this.nome = nome;
            this.preco = preco;
        }


        public long getId() {
            return id;
        }


        public String getNome() {
            return nome;
        }


        public Double getPreco() {
            return preco;
        }


        public void setId(Long id) {
            this.id = id;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public void setPreco(Double preco) {
            this.preco = preco;
        }

        


        

        


        



    
}