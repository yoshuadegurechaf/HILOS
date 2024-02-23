package viper;

public class Pares extends Thread
{
	public void run(){
		int n;
		int contador=0;
		for (n=1;n&lt;=10;n++){
			if (n % 2 == 0) {
				System.out.print(&quot; &quot;+n+&quot;\n&quot;);

				contador=contador+n;
			}
		}
		System.out.print(&quot;La suma de los pares es : &quot;+contador + &quot;\n&quot;);
		System.out.print(&quot; ******************** \n&quot;);
	
	}
}