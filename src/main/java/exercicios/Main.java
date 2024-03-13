package exercicios;
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        CidadeRecord cidadeRecord = new CidadeRecord("São Paulo");
        Cidade cidade = new Cidade("Rio de Janeiro");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidade);
        PessoaRecord pessoa = new PessoaRecord("Maria", cidadeRecord);

        // Testando os valores
        System.out.println("Pessoa shallow: " + pessoaShallow);
        System.out.println("Pessoa: " + pessoa);
    }
}
