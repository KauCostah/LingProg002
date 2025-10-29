package atividade;

//Classe principal para testar o sistema
public class Main {
 public static void main(String[] args) {
     // Criando uma pessoa física
     PessoaFisica pessoaFisica = new PessoaFisica(
         "Luis", 
         35, 
         "Feira de Santana - RG", 
         "067.2598-29"
     );
     
     // Criando uma pessoa jurídica
     PessoaJuridica pessoaJuridica = new PessoaJuridica(
         "Empresa ABC Ltda", 
         10, 
         "Avenida Principal, 123 - Salvador - BA", 
         "12.345.678/0001-90"
     );
     
     // Exibindo os dados
     pessoaFisica.showData();
     System.out.println();
     pessoaJuridica.showData();
     
     // Demonstrando o uso dos métodos getters e setters
     System.out.println("\n=== ALTERANDO DADOS ===");
     pessoaFisica.setEndereco("Nova Rua, 456 - Feira de Santana - BA");
     pessoaFisica.setIdade(36);
     
     System.out.println("Dados atualizados da pessoa física:");
     pessoaFisica.showData();
     
     // Exemplo de polimorfismo
     System.out.println("\n=== EXEMPLO DE POLIMORFISMO ===");
     Pessoa[] pessoas = {pessoaFisica, pessoaJuridica};
     
     for (Pessoa pessoa : pessoas) {
         System.out.println("Processando: " + pessoa.getNome());
         pessoa.showData();
         System.out.println();
     }
 }
}