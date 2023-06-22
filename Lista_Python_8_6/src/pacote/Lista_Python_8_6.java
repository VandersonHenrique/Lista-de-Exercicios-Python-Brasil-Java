package pacote;

public class Lista_Python_8_6 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.toString());
		tv.setCanal(99);
		System.out.println(tv.toString());
		tv.aumentarVolume();
		System.out.println(tv.toString());
		tv.diminuirVolume();
		System.out.println(tv.toString());
	}

}
