package model;

public record PessoaRecordShallow(String nome, Cidade cidade) {
    @Override
    public String toString() {
        return "PessoaRecordShallow{" +
                "nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
