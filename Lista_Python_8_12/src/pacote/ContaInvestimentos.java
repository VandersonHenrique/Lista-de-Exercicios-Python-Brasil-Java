package pacote;

public class ContaInvestimentos extends Conta{
private float taxaJuros;
public ContaInvestimentos(int numero, String nome, float saldo, float taxaJuros)
{
super(numero, nome, saldo);
this.taxaJuros = taxaJuros;
}
public void adicioneJuros() {
this.saldo += (this.saldo * this.taxaJuros/100);
}
@Override
public String toString() {
return "ContaInvestimentos [taxaJuros=" + taxaJuros + ", saldo=" + saldo + "]";
}
}