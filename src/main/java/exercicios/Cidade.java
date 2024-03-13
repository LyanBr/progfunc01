
record CidadeRecord(String nome) {}
class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


record PessoaRecordShallow(String nome, Cidade cidade) {}

record PessoaRecord(String nome, CidadeRecord cidade) {}

}
