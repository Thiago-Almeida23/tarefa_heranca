package br.com.tarefa_m13;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String email, String cnpj) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome() + ", CNPJ: " + cnpj);
        System.out.println("Endereço: " + getEndereco() + ", Telefone: " + getTelefone() + ", Email: " + getEmail());
    }
}

