package atividade;

abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    
    // Construtor
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    // Métodos getters
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // Método abstrato que deve ser implementado pelas classes filhas
    public abstract void showData();
}
