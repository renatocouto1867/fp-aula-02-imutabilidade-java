import model.Cidade;
import model.CidadeRecord;
import model.PessoaRecord;
import model.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {

        Cidade cidade = new Cidade("Palmas");
        PessoaRecordShallow pessoaRecordShallow = new PessoaRecordShallow("Renato",cidade);
        System.out.println(pessoaRecordShallow);

        //como a classe cidade é mutavel eu possa alterar
        cidade.setNome("Paraiso");
        System.out.println(cidade.getNome());


        //como a pessoal recorde é imutalve não é possivel fazer a alteração.
        CidadeRecord cidadeRecord = new CidadeRecord("Porto Nacional");
        PessoaRecord pessoaRecord =  new PessoaRecord("Renato",cidadeRecord);
        System.out.println(pessoaRecord);



    }
}
