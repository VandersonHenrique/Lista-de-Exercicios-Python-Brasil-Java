package pacote;


public class BombaCombustivel{
private String tipoCombustivel;
private float valorLitro;
public float quantidadeCombustivel;


public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
this.tipoCombustivel = tipoCombustivel;
this.valorLitro = valorLitro;
this.quantidadeCombustivel = quantidadeCombustivel;
}

public void alterarValor(float valorLitro) {
this.valorLitro = valorLitro;
}

public void alterarCombustivel(String tipoCombustivel) {
this.tipoCombustivel = tipoCombustivel;
}

public void alterarQuantidadeCombustivel(float quantidadeCombustivel)
{
this.quantidadeCombustivel = quantidadeCombustivel;
}

public float abastecerPorValor(float valor) {
float temp;
temp = valor/valorLitro;
alterarQuantidadeCombustivel(this.quantidadeCombustivel - temp);
return temp;
}

public float abastecerPorLitro(float qtd) {
float temp2;
temp2 = qtd * valorLitro;
alterarQuantidadeCombustivel(this.quantidadeCombustivel - qtd);
return temp2;
}
}