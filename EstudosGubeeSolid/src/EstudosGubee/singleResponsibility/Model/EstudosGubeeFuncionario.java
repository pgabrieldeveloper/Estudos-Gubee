package EstudosGubee.singleResponsibility.Model;

public class EstudosGubeeFuncionario {
    private String cpf;
    private String nome;
    private Double salario;
    private Cargo cargo;

    public EstudosGubeeFuncionario(String cpf, String nome, Double salario, Cargo cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Double CalcularDescontoSalrio() {
        return cargo.getRegra().calcula(this);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
