public class Cliente {
    private String nome;
    private long cod;
    private String cpf;
    private String email;
    private String usuario;
    private String senha;

    //Construtor
    public Cliente(String nome, long cod, String cpf, String email, String usuario, String senha) {
        this.nome = nome;
        this.cod = cod;
        this.cpf = cpf;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    //get & set

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

    // Método login
    public void fazerLogin(String usuario, String senha) {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            System.out.println("Cliente " + nome + " fez login com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }
    }
}
