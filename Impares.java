package viper;

public class Impares extends Thread
	{
	public void run(){
		int n, c=0;
		int contador=0;
		for ( n=1;n&lt;=10;n++){
		c= n%2;
		if (c != 0) {
			contador=contador+n;
			System.out.println(&quot; &quot;+n);
			}
		}
	System.out.print(&quot;La suma de los impares es : &quot;+contador + &quot;\n&quot;);
	}

}