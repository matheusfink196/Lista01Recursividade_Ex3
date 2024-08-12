package controller;

public class FactorialController {
	
	public FactorialController() {
		super();
	}
	
	public int fatorial(int fat) {
		if (fat==0){
			return 1;
//ponto de saida: se o numero for 0 ele retorna 1 para realizar o fatorial
		} else {
			
			fat = fat*(fatorial(fat-1));
//passo: quando retorna 1 ele faz a multiplicação com a recursiva
			
		}
		return fat;
		
	}
}
