package pacote;

public class Funcionario {
private String nome;
private float salario;
public Funcionario(String nome, float salario)
{
this.nome = nome;
this.salario = salario;
}
public String getNome() {
return nome;
}
public float getSalario() {
return salario;
}
public void aumentarSalario(float porcentagemDeAumento) {
this.salario += this.salario * (porcentagemDeAumento)/100;
}
}