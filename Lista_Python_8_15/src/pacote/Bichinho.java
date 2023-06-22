package pacote;

public class Bichinho {
private String nome;
private float fome;
private float saude;
private float idade;
public Bichinho(String nome, float fome, float saude, float idade) {
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
public float getFome() {
return fome;
}
public void setFome(float fome) {
this.fome = fome;
}
public float getSaude() {
return saude;
}
public void setSaude(float saude) {
this.saude = saude;
}
public float getIdade() {
return idade;
}
public void setIdade(float idade) {
this.idade = idade;
}
public float humor() {
return getFome() * getSaude();
}
public void alimenta(float quantidade) {
if ((quantidade >= 0) && (quantidade <= 100)) {
this.fome = this.fome - (this.fome * (quantidade/100.0f));
}
}
public void brincar(int quantidade) {
if ((quantidade >= 0) && (quantidade <= 100)) {
this.saude += this.saude * (quantidade/100.0f);
}
}
}