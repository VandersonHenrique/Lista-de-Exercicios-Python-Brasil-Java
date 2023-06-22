package pacote;

public class Lista_Python_8_11 {

	public static void main(String[] args) {
		Carro meuFusca = new Carro(8);
		meuFusca.adicionarGasolina(50);
		System.out.println(meuFusca.toString());
		meuFusca.andar(300);
		meuFusca.obterGasolina();
		System.out.println(meuFusca.toString());
		 
	}

}
