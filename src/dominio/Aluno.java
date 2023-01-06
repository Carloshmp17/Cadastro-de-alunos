package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * a) classe aluno com construtor, getters, setters e sobrescrita
 * @author Luis Gabriel
 */
public class Aluno {

    private Integer matricula;
    private String nome;
    private Integer idade;
    private Date dataNascimento;
    private String telefone;
    private String cpf;

    public Aluno(Integer matricula, String nome, Integer idade, Date data, String telefone, String cpf) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = data;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    public Aluno(Aluno cadastro) {
        super();
        this.matricula = cadastro.getMatricula();
        this.nome = cadastro.getNome();
        this.idade = cadastro.getIdade();
        this.dataNascimento = cadastro.getDataNascimento();
        this.telefone = cadastro.getTelefone();
        this.cpf = cadastro.getCpf();
    }
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return matricula + "\t" + nome + "\t" + idade + "\t" + formatador.format(dataNascimento) + "\t" + telefone
                + "\t" + cpf;
    }

    public String toArchive() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return matricula + "," + nome + "," + idade + "," + formatador.format(dataNascimento) + "," + telefone + "," + cpf;
    }

}
