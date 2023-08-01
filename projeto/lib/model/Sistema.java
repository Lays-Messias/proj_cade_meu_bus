import java.time.LocalDateTime;
import java.util.List;

public class Sistema {
    private LocalDateTime horarios;
    private List<String> linhas;
    private List<Rota> rotas;
    private List<Cliente> clientes;
    private Funcionario funcionario;

    //Construtor
    public Sistema(LocalDateTime horarios, List<String> linhas, List<Rota> rotas, List<Cliente> clientes, Funcionario funcionario) {
        this.horarios = horarios;
        this.linhas = linhas;
        this.rotas = rotas;
        this.clientes = clientes;
        this.funcionario = funcionario;
    }

    // Get e Set
    public LocalDateTime getHorarios() {
        return horarios;
    }

    public void setHorarios(LocalDateTime horarios) {
        this.horarios = horarios;
    }

    public List<String> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<String> linhas) {
        this.linhas = linhas;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


   public class Cliente {
    
    public void fazerLogin(String usuario, String senha) {
    }

    public void atualizarDados() {
        atualizarHorarios();
        atualizarLinhas();
        atualizarRotas();
        System.out.println("Dados do sistema atualizados com sucesso!");
    }
    private void atualizarHorarios() {
        System.out.println("Buscando novos horários de um serviço externo...");
        System.out.println("Horários atualizados com sucesso!");
    }

    private void atualizarLinhas() {
        System.out.println("Adicionando uma nova linha...");
        System.out.println("Linhas atualizadas com sucesso!");
    }

    private void atualizarRotas() {
        System.out.println("Recalculando as rotas existentes...");
        System.out.println("Rotas atualizadas com sucesso!");
    }
}

public class SistemaTransporte {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 123456, "123.456.789-01", "joao@example.com", "joao123", "senha123");

        cliente.fazerLogin("joao123", "senha123");

        cliente.atualizarDados();
    }
}
