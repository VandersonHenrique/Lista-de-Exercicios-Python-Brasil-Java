package pacote;

public class Quadrado
{
private float lado;
public Quadrado(float lado) {
setLado(lado);
}
public void setLado(float lado) {
this.lado = lado;
}
public float getLado() {
return lado;
}
public float area() {
return this.lado * this.lado;
}

}
