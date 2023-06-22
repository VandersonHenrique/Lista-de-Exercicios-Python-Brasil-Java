package pacote;

import java.util.ArrayList;
public class Macaco
{
private String nome;
private ArrayList<Object> bucho = new ArrayList();
public Macaco(String nome) {
this.nome = nome;
}
public void comer(Object ob) {
bucho.add(ob);
}
public void verBucho() {
for(Object i : bucho)
System.out.println("Bucho: " + i.toString());
}
public void digerir() {
if (!bucho.isEmpty())
bucho.remove(bucho.size()-1);}
}