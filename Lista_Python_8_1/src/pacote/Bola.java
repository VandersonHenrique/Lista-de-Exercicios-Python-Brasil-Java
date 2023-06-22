package pacote;

public class Bola{
private String cor;
private int circunferencia;
private String material;
public Bola(String cor, int circunferencia, String material)
{
super();
this.cor = cor;
this.circunferencia = circunferencia;
this.material = material;
}
public void trocaCor(String cor) {
this.cor = cor;
}
public String mostraCor() {
return this.cor;
  }
}