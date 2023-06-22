package pacote;

public class Carro {
private float consumo;
private float nivelCombustivel;
public Carro(float consumo) {
this.consumo = consumo;
}
public void andar(float distancia) {
float temp;
temp = distancia/this.consumo;
this.nivelCombustivel -= temp;
}
public float obterGasolina() {
return this.nivelCombustivel;
}
public void adicionarGasolina(float qtd) {
this.nivelCombustivel += qtd;
}
@Override
public String toString() {
return "Carro [consumo=" + consumo + ", nivelCombustivel=" + nivelCombustivel + "]";
}
}