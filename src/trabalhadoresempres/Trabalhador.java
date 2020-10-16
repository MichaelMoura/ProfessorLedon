package trabalhadoresempres;

public class Trabalhador {
    private String nome;
    private char sexo;
    private float salario;

    public Trabalhador() {
    }

    public Trabalhador(String nome, char sexo, float salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador {" + "nome=" + nome + ", sexo=" + sexo 
                + ", salario=" + salario + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
