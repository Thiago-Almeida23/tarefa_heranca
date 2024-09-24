package br.com.tarefa_m13;

public class App {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica(
                "João Silva",
                "Rua A, 123",
                "(21) 1234-5678",
                "joao.silva@email.com",
                "123.456.789-00"
        );

        PessoaJuridica pj = new PessoaJuridica(
                "J. Silva Enterprises",
                "Avenida B, 456",
                "(21) 99876-5432",
                "contato@jse.com.br",
                "12.345.678/0001-99"
        );

        pf.exibirInfo();
        System.out.println();
        pj.exibirInfo();
    }
}

