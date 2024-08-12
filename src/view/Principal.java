package view;
import controller.FactorialController;
public class Principal {
	
	public static void main (String args[]) {
		FactorialController fatcontrol = new FactorialController();
		int fatorial = 5;
		int resul = fatcontrol.fatorial(fatorial);
		System.out.println(resul);
		
	}
}
