package pacote;

public class Bichinho {
private String nome;
private int fome;
private int saude;
private int idade;
public Bichinho(String nome, int fome, int saude, int idade) {
this.nome = nome;
this.fome = fome;
this.saude = saude;
this.idade = idade;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public int getFome() {
return fome;
}
public void setFome(int fome) {
this.fome = fome;
}
public int getSaude() {
return saude;
}
public void setSaude(int saude) {
this.saude = saude;
}
public int getIdade() {
return idade;
}
public void setIdade(int idade) {
this.idade = idade;
}
public float humor() {
return getFome() * getSaude();
}
}