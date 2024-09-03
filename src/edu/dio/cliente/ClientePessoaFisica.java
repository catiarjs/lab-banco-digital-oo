package edu.dio.cliente;

public class ClientePessoaFisica extends Cliente{
    private String cpf;
    private String nome;
    private String dataNascimento;

    public ClientePessoaFisica(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void imprimirInformacoesCadastrais() {
        System.out.println("=== Informações do Cliente Pessoa Física ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);

        if(this.dataNascimento != null) {
            System.out.println("Data de Nascimento: " + this.dataNascimento);
        }

        this.imprimirEndereco();
    }
}
