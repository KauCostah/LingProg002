package atividade;

class PessoaJuridica extends Pessoa {
    private String cnpj;
    
    
    public PessoaJuridica(String nome, int idade, String endereco, String cnpj) {
        super(nome, idade, endereco);
        this.cnpj = cnpj;
    }
    
  
    public String getCNPJ() {
        return cnpj;
    }
    
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    @Override
    public void showData() {
        System.out.println("=== DADOS DA PESSOA JURÍDICA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("================================");
    }
}

