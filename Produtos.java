/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque.Model;

/**
 *
 * @author Aluno
 */
public class Produtos {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
