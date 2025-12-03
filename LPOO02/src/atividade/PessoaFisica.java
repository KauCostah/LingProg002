package atividade;

class PessoaFisica extends Pessoa {
    private String cpf;
    
    
    public PessoaFisica(String nome, int idade, String endereco, String cpf) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }
    
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
   
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


