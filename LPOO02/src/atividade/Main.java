package atividade;


public class Main {
 public static void main(String[] args) {
     
     PessoaFisica pessoaFisica = new PessoaFisica(
         "Luis", 
         35, 
         "Feira de Santana - RG", 
         "067.2598-29"
     );
     
     PessoaJuridica pessoaJuridica = new PessoaJuridica(
         "Empresa ABC Ltda", 
         10, 
         "Avenida Principal, 123 - Salvador - BA", 
         "12.345.678/0001-90"
     );
     
    
     pessoaFisica.showData();
     System.out.println();
     pessoaJuridica.showData();
     
   
     System.out.println("\n=== ALTERANDO DADOS ===");
     pessoaFisica.setEndereco("Nova Rua, 456 - Feira de Santana - BA");
     pessoaFisica.setIdade(36);
     
     System.out.println("Dados atualizados da pessoa física:");
     pessoaFisica.showData();
     
    
     System.out.println("\n=== EXEMPLO DE POLIMORFISMO ===");
     Pessoa[] pessoas = {pessoaFisica, pessoaJuridica};
     
     for (Pessoa pessoa : pessoas) {
         System.out.println("Processando: " + pessoa.getNome());
         pessoa.showData();
         System.out.println();
     }
 }

}
