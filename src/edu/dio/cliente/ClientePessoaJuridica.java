package edu.dio.cliente;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String dataAbertura;

    public ClientePessoaJuridica(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNome() {
        return nomeFantasia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void imprimirInformacoesCadastrais() {
        System.out.println("=== Informações do Cliente Pessoa Jurídica ===");
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Cnpj: " + this.cnpj);

        if(this.dataAbertura != null) {
            System.out.println("Data de Abertura: " + this.dataAbertura);
        }

        this.imprimirEndereco();
    }
}
