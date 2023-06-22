package pacote;

public class Retangulo{
Ponto c1, c2;
float x_centro, y_centro;
public Retangulo(Ponto canto1, Ponto canto2) {
c1 = canto1;
c2 = canto2;
}
public String centro() {
x_centro = (c1.getX() + c2.getX())/2;
y_centro = (c1.getY() + c2.getY())/2;
return "X = " + x_centro + "Y =" + y_centro;
}
@Override
public String toString() {
return "Retangulo [c1=" + c1 + ", c2=" + c2 + ", x_centro=" + x_centro + ", y_centro=" + y_centro + "]";
}
}