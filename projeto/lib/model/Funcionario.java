public class Funcionario {
    private int salario;
    private String nome;
    private long cod;
    private String cpf;
    private String email;

    //Construtor
    public Funcionario(int salario, String nome, long cod, String cpf, String email) {
        this.salario = salario;
        this.nome = nome;
        this.cod = cod;
        this.cpf = cpf;
        this.email = email;
    }

    // Get e Set
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}