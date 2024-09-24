package br.com.tarefa_m13;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String email, String cpf) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome() + ", CPF: " + cpf);
        System.out.println("Endereço: " + getEndereco() + ", Telefone: " + getTelefone() + ", Email: " + getEmail());
    }
}

