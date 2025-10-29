package atividade;

class PessoaFisica extends Pessoa {
    private String cpf;
    
    // Construtor
    public PessoaFisica(String nome, int idade, String endereco, String cpf) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }
    
    // Getter e Setter para CPF
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    // Implementação do método abstrato
    @Override
    public void showData() {
        System.out.println("=== DADOS DA PESSOA FÍSICA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("===============================");
    }
}

