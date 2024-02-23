package viper;

public class Inicial
{
	public static void main(String []args){
		Pares eje1 = new Pares();
		eje1.start();
		Impares eje2 = new Impares();
		eje2.start();
		Aud eje3= new Aud();
		eje3.start();
	}
}